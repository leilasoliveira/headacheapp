FROM ubuntu:latest
LABEL authors="leilafarias"

ENTRYPOINT ["top", "-b"]