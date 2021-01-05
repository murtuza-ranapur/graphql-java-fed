FROM node:13
WORKDIR /app
COPY package.json /app
RUN npm install
COPY . /app
CMD node gateway.js
EXPOSE 4000