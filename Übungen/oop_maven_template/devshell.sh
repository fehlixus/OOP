#!/bin/bash

VERSION="$1"
if [ -z "$VERSION" ]; then
	VERSION="3.9.4"
fi
IMAGE="maven:${VERSION}-eclipse-temurin-17"
docker pull "$IMAGE"
docker run -it --rm --workdir "/work" -v "$(pwd):/work" -v "$HOME/.m2:/root/.m2" "$IMAGE" bash