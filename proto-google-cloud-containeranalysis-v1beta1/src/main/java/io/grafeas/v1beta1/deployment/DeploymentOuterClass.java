// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/devtools/containeranalysis/v1beta1/deployment/deployment.proto

package io.grafeas.v1beta1.deployment;

public final class DeploymentOuterClass {
  private DeploymentOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_grafeas_v1beta1_deployment_Deployable_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_grafeas_v1beta1_deployment_Deployable_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_grafeas_v1beta1_deployment_Details_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_grafeas_v1beta1_deployment_Details_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_grafeas_v1beta1_deployment_Deployment_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_grafeas_v1beta1_deployment_Deployment_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nEgoogle/devtools/containeranalysis/v1be" +
      "ta1/deployment/deployment.proto\022\032grafeas" +
      ".v1beta1.deployment\032\037google/protobuf/tim" +
      "estamp.proto\"\"\n\nDeployable\022\024\n\014resource_u" +
      "ri\030\001 \003(\t\"E\n\007Details\022:\n\ndeployment\030\001 \001(\0132" +
      "&.grafeas.v1beta1.deployment.Deployment\"" +
      "\303\002\n\nDeployment\022\022\n\nuser_email\030\001 \001(\t\022/\n\013de" +
      "ploy_time\030\002 \001(\0132\032.google.protobuf.Timest" +
      "amp\0221\n\rundeploy_time\030\003 \001(\0132\032.google.prot" +
      "obuf.Timestamp\022\016\n\006config\030\004 \001(\t\022\017\n\007addres" +
      "s\030\005 \001(\t\022\024\n\014resource_uri\030\006 \003(\t\022A\n\010platfor" +
      "m\030\007 \001(\0162/.grafeas.v1beta1.deployment.Dep" +
      "loyment.Platform\"C\n\010Platform\022\030\n\024PLATFORM" +
      "_UNSPECIFIED\020\000\022\007\n\003GKE\020\001\022\010\n\004FLEX\020\002\022\n\n\006CUS" +
      "TOM\020\003B\207\001\n\035io.grafeas.v1beta1.deploymentP" +
      "\001Z^google.golang.org/genproto/googleapis" +
      "/devtools/containeranalysis/v1beta1/depl" +
      "oyment;deployment\242\002\003GRAb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.TimestampProto.getDescriptor(),
        }, assigner);
    internal_static_grafeas_v1beta1_deployment_Deployable_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_grafeas_v1beta1_deployment_Deployable_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_grafeas_v1beta1_deployment_Deployable_descriptor,
        new java.lang.String[] { "ResourceUri", });
    internal_static_grafeas_v1beta1_deployment_Details_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_grafeas_v1beta1_deployment_Details_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_grafeas_v1beta1_deployment_Details_descriptor,
        new java.lang.String[] { "Deployment", });
    internal_static_grafeas_v1beta1_deployment_Deployment_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_grafeas_v1beta1_deployment_Deployment_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_grafeas_v1beta1_deployment_Deployment_descriptor,
        new java.lang.String[] { "UserEmail", "DeployTime", "UndeployTime", "Config", "Address", "ResourceUri", "Platform", });
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
