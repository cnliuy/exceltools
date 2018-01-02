#!/bin/sh  

#ffdir = "/home/vas/vms/vmsposter/"
ffdir="/home/ly/lydoc/"
cd  $ffdir
echo "in $ffdir :"
ls -l


# Create folder

datafolder="0/"
datafolder2="1/"
datafolder3="5/"

if [ -d "./$datafolder" ];then
   echo "The $datafolder dir is exist!"
else
   mkdir -p ./$datafolder
   echo "Finished cteate $datafolder dir ."
fi


if [ -d "./$datafolder2" ];then
   echo "The $datafolder2 dir is exist!"
else
   mkdir -p ./$datafolder2
   echo "Finished cteate $datafolder2 dir ."
fi

if [ -d "./$datafolder3" ];then
   echo "The $datafolder3 dir is exist!"
else
   mkdir -p ./$datafolder3
   echo "Finished cteate $datafolder3 dir ."
fi



echo "This part will adjust . ----start--- "

cp  ./201611/img2016111314313538294.jpg  ./5/img2016111314313538294.jpg
cp  ./201702/img2017021715554618367.jpg  ./0/img2017021715554618367.jpg
cp  ./201706/img2017060916214127986.jpg  ./1/img2017060916214127986.jpg

echo "This part will adjust . ----end--- "

echo "-- Finished copy work ! --"
