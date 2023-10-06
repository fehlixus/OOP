@echo off

set "VERSION=%1"
if "%VERSION%"=="" (
	set "VERSION=3.9.4"
)
set IMAGE="maven:%VERSION%-eclipse-temurin-17"
docker pull %IMAGE%
docker run -it --rm --workdir "/work" -v "%cd%:/work" -v "%homedrive%%homepath%\.m2\:/root/.m2" %IMAGE% bash