cd ../frontend/
npm i
npm run build

cd ../backend/
./mvnw clean package

mv ./target/*.jar ../env/openjdk/deployment/line-db.jar
