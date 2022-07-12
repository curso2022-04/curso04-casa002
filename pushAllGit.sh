#!/bin/bash
echo -n "Escribe el mensaje del commit correspondiente: "
read message

git add .
git commit -m "$message"
git push
git log --decorate --all --oneline --graph
