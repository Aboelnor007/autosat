#!/bin/bash

# Check the number of command-line arguments
if [ \( "$#" -ne 1 \) ] ; then
	echo "usage: ${0} <file>"
	exit 1
fi

INPUT="${1}"

RUNCMD="./runFairFancy --silent"

TMPFILE=`mktemp /tmp/bench.XXXXXXXXXXX`
OUTFILE=`mktemp /tmp/bench.XXXXXXXXXXX`
cat ${INPUT} \
	| grep -v '^logLevel' \
	| grep -v '^explicitChecksUntilLength' \
	> ${TMPFILE}
echo "logLevel: 1;" >> ${TMPFILE}

echo -n "$(date "+%y-%m-%d %H:%M:%S");	"
echo -n "${INPUT};	"
STARTTIME=$(date +%s.%N)
${RUNCMD} ${TMPFILE} > ${OUTFILE}
ENDTIME=$(date +%s.%N)
DIFFTIME=$(echo "$ENDTIME - $STARTTIME" | bc)

grep -q "VERDICT: Player 2 can win from every" ${OUTFILE}
ret=$?

if [ "$ret" -eq 0 ] ; then
	echo -e -n "\e[1;32mCORRECT\e[0m;	"
else
	echo -e -n "--\e[1;31mFAILURE\e[0m--;	"
fi

echo -n "${DIFFTIME};	"
echo "( ${OUTFILE} )"
