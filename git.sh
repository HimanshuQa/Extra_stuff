#!/bin/bash


read -p 'enter url of repository to clone:'  urlvar

git clone $urlvar



mails=$(echo $urlvar | tr "/" "\n")

echo getting the name of directory that is cloned

for addr in $mails
do
   printf "."
   sleep .5
done

cd $addr

echo "done"

echo "lets change file for github and file is opening in 3 dots"

for i in . . .
do
    printf $i
    sleep 1
done


vi anything.txt

read -p 'enter message for commit: ' msg

git add .


git commit -m $msg

git push origin master 



