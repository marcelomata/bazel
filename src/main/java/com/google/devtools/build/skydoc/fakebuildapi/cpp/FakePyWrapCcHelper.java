// Copyright 2019 The Bazel Authors. All rights reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//    http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.devtools.build.skydoc.fakebuildapi.cpp;

import com.google.devtools.build.lib.collect.nestedset.Depset;
import com.google.devtools.build.lib.skylarkbuildapi.FileApi;
import com.google.devtools.build.lib.skylarkbuildapi.RunfilesApi;
import com.google.devtools.build.lib.skylarkbuildapi.StarlarkRuleContextApi;
import com.google.devtools.build.lib.skylarkbuildapi.cpp.CcCompilationContextApi;
import com.google.devtools.build.lib.skylarkbuildapi.cpp.CcInfoApi;
import com.google.devtools.build.lib.skylarkbuildapi.cpp.CcToolchainProviderApi;
import com.google.devtools.build.lib.skylarkbuildapi.cpp.CompilationInfoApi;
import com.google.devtools.build.lib.skylarkbuildapi.cpp.FeatureConfigurationApi;
import com.google.devtools.build.lib.skylarkbuildapi.cpp.PyWrapCcHelperApi;
import com.google.devtools.build.lib.skylarkbuildapi.cpp.PyWrapCcInfoApi;
import com.google.devtools.build.lib.skylarkbuildapi.cpp.WrapCcIncludeProviderApi;
import com.google.devtools.build.lib.skylarkbuildapi.platform.ConstraintValueInfoApi;
import com.google.devtools.build.lib.syntax.Sequence;

/** Fake implementation of {@link PyWrapCcHelperApi}. */
public class FakePyWrapCcHelper
    implements PyWrapCcHelperApi<
        FileApi,
        ConstraintValueInfoApi,
        StarlarkRuleContextApi<ConstraintValueInfoApi>,
        CcInfoApi<FileApi>,
        FeatureConfigurationApi,
        CcToolchainProviderApi<FeatureConfigurationApi>,
        CompilationInfoApi<FileApi>,
        CcCompilationContextApi<FileApi>,
        WrapCcIncludeProviderApi> {

  @Override
  public Sequence<String> getPyExtensionLinkopts(
      StarlarkRuleContextApi<ConstraintValueInfoApi> skylarkRuleContext) {
    return null;
  }

  @Override
  public Depset getTransitivePythonSources(
      StarlarkRuleContextApi<ConstraintValueInfoApi> skylarkRuleContext, FileApi pyFile) {
    return null;
  }

  @Override
  public RunfilesApi getPythonRunfiles(
      StarlarkRuleContextApi<ConstraintValueInfoApi> skylarkRuleContext, Depset filesToBuild) {
    return null;
  }

  @Override
  public PyWrapCcInfoApi<FileApi> getPyWrapCcInfo(
      StarlarkRuleContextApi<ConstraintValueInfoApi> skylarkRuleContext,
      CcInfoApi<FileApi> ccInfo) {
    return null;
  }

  @Override
  public FeatureConfigurationApi skylarkGetFeatureConfiguration(
      StarlarkRuleContextApi<ConstraintValueInfoApi> skylarkRuleContext,
      CcToolchainProviderApi<FeatureConfigurationApi> ccToolchain) {
    return null;
  }

  @Override
  public Depset skylarkCollectTransitiveSwigIncludes(
      StarlarkRuleContextApi<ConstraintValueInfoApi> skylarkRuleContext) {
    return null;
  }

  @Override
  public String skylarkGetMangledTargetName(
      StarlarkRuleContextApi<ConstraintValueInfoApi> skylarkRuleContext) {
    return null;
  }

  @Override
  public WrapCcIncludeProviderApi getWrapCcIncludeProvider(
      StarlarkRuleContextApi<ConstraintValueInfoApi> skylarkRuleContext, Depset swigIncludes) {
    return null;
  }

  @Override
  public void registerSwigAction(
      StarlarkRuleContextApi<ConstraintValueInfoApi> skylarkRuleContext,
      CcToolchainProviderApi<FeatureConfigurationApi> ccToolchain,
      FeatureConfigurationApi featureConfiguration,
      CcCompilationContextApi<FileApi> wrapperCcCompilationContext,
      Depset swigIncludes,
      FileApi swigSource,
      Sequence<?> subParameters,
      FileApi ccFile,
      FileApi headerFile,
      Sequence<?> outputFiles,
      Object outDir,
      Object javaDir,
      Depset auxiliaryInputs,
      String swigAttributeName,
      Object zipTool) {}

  @Override
  public CompilationInfoApi<FileApi> skylarkCreateCompileActions(
      StarlarkRuleContextApi<ConstraintValueInfoApi> skylarkRuleContext,
      FeatureConfigurationApi featureConfiguration,
      CcToolchainProviderApi<FeatureConfigurationApi> ccToolchain,
      FileApi ccFile,
      FileApi headerFile,
      Sequence<?> depCcCompilationContexts,
      Sequence<?> targetCopts) {
    return null;
  }
}
