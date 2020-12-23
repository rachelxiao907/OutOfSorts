TIMEFORMAT=%R
TIMES=(4000 8000 16000 32000 64000 128000)
echo "Insertion equal values"
for t in ${TIMES[@]}; do
  time java Driver $t insertion equal;
done
echo "Selection equal values"
for t in ${TIMES[@]}; do
  time java Driver $t selection equal;
done
echo "Bubble equal values"
for t in ${TIMES[@]}; do
  time java Driver $t bubble equal;
done
echo "--------------------"
echo "Insertion sorted values"
for t in ${TIMES[@]}; do
  time java Driver $t insertion sorted;
done
echo "Selection sorted values"
for t in ${TIMES[@]}; do
  time java Driver $t selection sorted;
done
echo "Bubble sorted values"
for t in ${TIMES[@]}; do
  time java Driver $t bubble sorted;
done
echo "--------------------"
echo "Insertion random values"
for t in ${TIMES[@]}; do
  time java Driver $t insertion random;
done
echo "Selection Random values"
for t in ${TIMES[@]}; do
  time java Driver $t selection random;
done
echo "Bubble Random values"
for t in ${TIMES[@]}; do
  time java Driver $t bubble random;
done
echo "--------------------"
echo "Insertion reversed values"
for t in ${TIMES[@]}; do
  time java Driver $t insertion reversed;
done
echo "Selection reversed values"
for t in ${TIMES[@]}; do
  time java Driver $t selection reversed;
done
echo "Bubble reversed values"
for t in ${TIMES[@]}; do
  time java Driver $t bubble reversed;
done
