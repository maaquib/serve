// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: inference.proto

package org.pytorch.serve.grpc.inference;

public interface PredictionResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:org.pytorch.serve.grpc.inference.PredictionResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * TorchServe health
   * </pre>
   *
   * <code>bytes prediction = 1;</code>
   * @return The prediction.
   */
  com.google.protobuf.ByteString getPrediction();
}