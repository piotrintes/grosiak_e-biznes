FROM ubuntu:18.04

ENV TZ=Europe/Warsaw
RUN ln -snf /usr/share/zoneinfo/$TZ /etc/localtime && echo $TZ > /etc/timezone 

RUN  apt-get update \
  && apt-get install -y wget \
  && rm -rf /var/lib/apt/lists/*
  
RUN apt-get update
RUN apt-get -y install software-properties-common

RUN add-apt-repository ppa:webupd8team/java
RUN apt-get install -y \
  openjdk-8-jdk
RUN apt-get remove scala-library scala
RUN wget http://scala-lang.org/files/archive/scala-2.12.8.deb
RUN dpkg -i scala-2.12.8.deb

RUN echo "deb https://dl.bintray.com/sbt/debian /" | tee -a /etc/apt/sources.list.d/sbt.list
RUN apt-key adv --keyserver hkp://keyserver.ubuntu.com:80 --recv 2EE0EA64E40A89B84B2DF73499E82A75642AC823


RUN apt-get update
RUN apt-get install -y \
  unzip \
  vim \
  git \
  scala \
  sbt \
  curl

ENV NODE_VERSION=6.8
RUN curl -o- https://raw.githubusercontent.com/creationix/nvm/v0.34.0/install.sh | bash
ENV NVM_DIR=/root/.nvm
RUN . "$NVM_DIR/nvm.sh" && nvm install ${NODE_VERSION}
RUN . "$NVM_DIR/nvm.sh" && nvm use v${NODE_VERSION}
RUN . "$NVM_DIR/nvm.sh" && nvm alias default v${NODE_VERSION}
ENV PATH="/root/.nvm/versions/node/v${NODE_VERSION}/bin/:${PATH}"

EXPOSE 8000
EXPOSE 9000
EXPOSE 5000
EXPOSE 8888

VOLUME ["/home/piotr/project"]
