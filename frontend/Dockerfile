FROM node:21.6.1

ARG REACT_APP_API_URL
ARG REACT_APP_GOOGLE_KEY
ARG REACT_APP_GOOGLE_TRACKING_ID
ARG REACT_APP_MUI_X_LICENSE
ARG REACT_APP_INVITATION_VIA_EMAIL
ENV REACT_APP_API_URL=${REACT_APP_API_URL}
ENV REACT_APP_GOOGLE_KEY=$REACT_APP_GOOGLE_KEY
ENV REACT_APP_GOOGLE_TRACKING_ID=$REACT_APP_GOOGLE_TRACKING_ID
ENV REACT_APP_MUI_X_LICENSE=$REACT_APP_MUI_X_LICENSE
ENV REACT_APP_INVITATION_VIA_EMAIL=$REACT_APP_INVITATION_VIA_EMAIL

WORKDIR /usr/src/app
COPY package*.json ./
RUN npm install --legacy-peer-deps
COPY . .
RUN npm run build
RUN npm install -g serve
EXPOSE 3000
#CMD ["npm", "start"]
CMD ["serve", "-s", "build", "-l", "3000"]
