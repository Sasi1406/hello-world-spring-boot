#!/bin/bash

registry= $1
image= $2

docker pull $registry/$image

if [ ! "$(docker ps -a | grep <name>)" ]; then
 docker stop --name <name>
else 
docker restart --name <name>
fi

docker ps -aq $image
if [ $? -eq 0 ];
then
     echo "Running"
else
     echo "Not running"
fi