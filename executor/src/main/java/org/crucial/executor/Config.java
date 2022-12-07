package org.crucial.executor;

public class Config {
    public static final String CONFIG_FILE = "config.properties";

    public static final String AWS_LAMBDA_LOGGING= "logging";
    public static final String AWS_LAMBDA_LOGGING_DEFAULT= "false";

    public static final String AWS_LAMBDA_REGION = "aws.region";
    public static final String AWS_LAMBDA_REGION_DEFAULT = "AWS_REGION";

    public static final String AWS_LAMBDA_FUNCTION_ARN = "aws.lambda.function.arn";
    public static final String AWS_LAMBDA_FUNCTION_ARN_DEFAULT = "arn:aws:lambda:AWS_REGION:ID:function:NAME";

    public static final String AWS_LAMBDA_FUNCTION_ASYNC = "aws.lambda.function.async";
    public static final String AWS_LAMBDA_FUNCTION_ASYNC_DEFAULT = "false";
}