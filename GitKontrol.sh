#!/bin/bash

opt=$1
path=$2

clear
echo ""
if [ -z $opt ]
then
	echo "Skrypt do kontroli repozytorium"
	echo "./GitKontrol.sh [option] <path>"
	echo ""
	echo "Podaj obcję którą chcesz wybrać:"
	read opt

	clear
	./GitKontrol.sh $opt

elif [ $opt = "-help" ]
then
	echo "Skrypt do kontroli repozytorium"
	echo "./GitKontrol.sh [option] <path>"
	echo "Opcje:"
	echo "-help	-Wyświetla pomoc"
	echo "-init	-Inicjalizuje repozytorium Git"
	echo "-clone	-Klonuje zdalne repozytorim"
	echo "-status	-Wyświetla aktualny status repozutorium/zmian"
	echo "-config	-Wyświetla konfigurację repozytorim"
	echo "-add	-Dodawanie plików do wypchnięcia na zdalne repozytorim"
	echo "-push	-Push do zdalnego repozytrium"
	echo "-pull	-Pobiera najnowsze ropozytorim z zdalnego ropozytotium"
	echo "-commit	-Nadaje nazwę commitu"

elif [ $opt = "-init" ]
then
	if [ -z $path ]
	then
		echo "Podaj ścieżkę gdzie chcesz utworzyć repozytotium git"
		read path
	fi

	cd $path
	git init

	echo "Podaj nazwę Authora"
	read name
	git config --global user.name $name

	echo "Podaj mail Autora"
	read mail
	git config --global user.name $mail

	echo "Podaj edytor"
	read edit
	git config --global core.editor $edit

	echo "Podaj link do zdalnego repozytorim"
	read http

	if [ -z $http ]
	then
		echo "Repozytorim zostało dodane tylko lokalnie"
	else
		echo "Podaj skrót do zdalnego repozytorium np origin"
		read repName

		git remote add $repName $http

		git remote show
	fi

elif [ $opt = "-clone" ]
then
	if [ -z $path ]
	then
		echo "Podaj ścieżkę do folderu narzędnego dla repozytorim"
		read path
	fi

	cd $path

	echo "Podaj adress Url do repozytorim"
	read url
	git clone $url

elif [ $opt = "-status" ]
then
	if [ -z $path ]
	then
		echo "Podaj ścieżkę do repozytorim"
		read path
	fi

	cd $path
	git status

elif [ $opt = "-config" ]
then
	if [ -z $path ]
	then
		echo "Podaj ścieżkę do repozytotium git"
		read path
	fi

	cd $path
	
	echo ""
	git config --list
	echo ""

	echo "Podaj nazwę Authora (Pozostaw puste jeśli ma być bez zmian)"
	echo ""
	read name
	
	if [ -z $name ]
	then
		echo "bez zmian"
		echo ""
	else
		git config --global user.name $name
	fi

	echo "Podaj mail Autora (Pozostaw puste jeśli ma być bez zmian)"
	read mail

	if [ -z $mail ]
	then
		echo "bez zmian"
		echo ""

	else
		git config --global user.name $mail
	fi

	echo "Podaj edytor (Pozostaw puste jeśli ma być bez zmian)"
	read edit

	if [ -z $edit ]
	then
		echo "bez zmian"
		echo ""
	else
		git config --global core.editor $edit
	fi

elif [ $opt = "-add" ]
then
	if [ -z $path ]
	then
		echo "Podaj ścieżkę do repozytorim"
		read path
	fi
	
	cd $path
	git status

	echo ""
	echo "Podaj nazwę pliku który chcesz dodać do push (kropka oznacza wszystkie)"
	read file

	git add $file
elif [ $opt = "-push" ]
then
	if [ -z $path ]
	then
		echo "Podaj ścieżkę do repozytorium"
		read path
	fi

	cd $path

	echo ""
	git status

	echo ""
	echo "Podaj ścieżkę do uploadu"
	git remote -v
	read remote

	echo ""
	echo "Podaj nazwę gałęzi do której chcesz push zrobić"
	read branch

	echo ""
	echo "Jesteś pewny że chcesz wykonać push na gałąź $branch"
	echo "[Y/N]"
	read chose

	if [ -z $chose ]
	then
		echo "Nie przyjęto danych"
	elif [ $chose = "N" ] || [ $chose = "n" ]
	then
		echo "Odmowa"
	elif [ $chose = "Y" ] || [ $chose = "y" ]
	then
		git push -uf $remote $branch
	elif [ $chose != "Y" ] || [ $chose != "N" ] || [ $chose = "y" ] || [ $chose = "n" ]


	then
		echo "Nie rozpoznano odpowiedzi"
	fi

elif [ $opt = "-pull" ]
then
	if [ -z $path ]
	then
		echo "Podaj ścieżkę do repozytorum"
		read path
	fi

	cd $path

	git remote -v
	echo "Podaj z którego linku ma pobrać"
	read http

	echo "Podaj jaki brach ma pobrać"
	read branch

	git pull $http $branch

elif [ $opt = "-commit" ]
then
	if [ -z $path ]
	then
		echo "Podaj ścieżkę do repozytorum"
		read path
	fi

	cd $path

	echo "Podaj nazwę commitu"
	read title

	git commit -m $title
fi


