FROM public.ecr.aws/lambda/java:17

COPY target/app.jar ${LAMBDA_TASK_ROOT}/app.jar

CMD ["app::com.raja.contacthub.handler::handleRequest"]
