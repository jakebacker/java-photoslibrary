// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/photos/library/v1/photos_library.proto

package com.google.photos.library.v1.proto;

public interface ListMediaItemsRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.photos.library.v1.ListMediaItemsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Maximum number of media items to return in the response. The default number
   * of media items to return at a time is 25. The maximum `pageSize` is 100.
   * </pre>
   *
   * <code>int32 page_size = 1;</code>
   */
  int getPageSize();

  /**
   *
   *
   * <pre>
   * A continuation token to get the next page of the results. Adding this to
   * the request returns the rows after the `pageToken`. The `pageToken` should
   * be the value returned in the `nextPageToken` parameter in the response to
   * the `listMediaItems` request.
   * </pre>
   *
   * <code>string page_token = 2;</code>
   */
  java.lang.String getPageToken();
  /**
   *
   *
   * <pre>
   * A continuation token to get the next page of the results. Adding this to
   * the request returns the rows after the `pageToken`. The `pageToken` should
   * be the value returned in the `nextPageToken` parameter in the response to
   * the `listMediaItems` request.
   * </pre>
   *
   * <code>string page_token = 2;</code>
   */
  com.google.protobuf.ByteString getPageTokenBytes();
}