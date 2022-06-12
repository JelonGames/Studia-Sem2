#!/bin/bash

option=$1

if [ $option = "--help" ]
then
	echo Opcje ./auto.sh
	echo --help 	-wyświetla listę opcji
	echo --init 	-skonfiguruje w gicie podstawowe informacje o autorze, domyślnym edytorze tekstu
	echo --install 	-skrypt pobierze projekt ze zdalnego repozytorium
	echo --update	-aktualizacja
fi

if [ $option = "--init" ]
then
	if [ -a ./git ]
	then
		echo Podaj nazwę autora
		read name
		git config --global user.name $name
		echo Podaj Email autora
		read email
		git config --global user.email $email
		echo Podaj domyślny edytor tekstu
		read edit
		git config --global core.editor $edit
	else
		echo nie znalazłem repozytoruim w katalogu ./git
	fi
fi

if [ $option = "--install" ]
then
	echo Podaj adres repozytorium do sklonowania
	read rep
	if [ -a ./git ]
	then
		cd ./git
	else
		mkdir ./git
		cd ./git
	fi
	git clone $rep
	
	touch path.bin
	date > path.bin
	ps >> path.bin

	tmp=$(pwd ./path.bin)
	PATH=$tmp
	export PATH

	echo $PATH >> path.bin
fi

if [ $option = "--update" ]
then
	if [ -a ./git/path.bin ]
	then
		tmp=$(pwd ./git/path.bin)
		if [ $PATH != $tmp ]
		then
			date > ./git/path.bin
			ps >> ./git/path.bin

			PATH=$tmp
			export PATH
			echo $PATH >> ./git/path.bin
		fi
	else
		./auto.sh --install
	fi
fi




