package com.uber.okbuck.rule

final class JavaLibraryRule extends JavaRule {

    JavaLibraryRule(
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
            List<String> testTargets) {

        super(
                "java_library",
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
                null,
                testTargets)
    }
}
