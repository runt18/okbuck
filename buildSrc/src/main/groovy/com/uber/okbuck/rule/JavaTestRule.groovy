package com.uber.okbuck.rule

final class JavaTestRule extends JavaRule {

    JavaTestRule(
            String name,
            List<String> visibility,
            List<String> deps,
            Set<String> srcSet,
            Set<String> annotationProcessors,
            Set<String> aptDeps,
            Set<String> providedDeps,
            String resourcesDir,
            String sourceCompatibility,
            String targetCompatibility,
            String javac,
            List<String> options,
            List<String> testRunnerJvmArgs) {
        super(
                "java_test",
                name,
                visibility,
                deps,
                srcSet,
                annotationProcessors,
                aptDeps,
                providedDeps,
                resourcesDir,
                sourceCompatibility,
                targetCompatibility,
                javac,
                options,
                testRunnerJvmArgs,
                null,
                ['unit', 'java'])
    }
}
