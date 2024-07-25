#!/bin/bash

if [ $# -eq 0 ]; then
  echo "Erro: Nome da classe Java não fornecido."
  echo "Uso: $0 <nome_classe>.java"
  exit 1
fi

nome_classe="$1"

javac "$nome_classe.java"

java $nome_classe

rm *.class