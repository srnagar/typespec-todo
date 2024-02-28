/* eslint-disable */
/**
 * This file was automatically generated by json-schema-to-typescript.
 * DO NOT MODIFY IT BY HAND. Instead, modify the source JSONSchema file,
 * and run json-schema-to-typescript to regenerate this file.
 */

export interface UserCreatedResponseJson {
  /**
   * An autogenerated unique id for the user
   */
  id: number;
  /**
   * The user's username
   */
  username: string;
  /**
   * The user's email address
   */
  email: string;
  /**
   * The user's password, provided when creating a user
   * but is otherwise not visible (and hashed by the backend)
   */
  password: string;
  /**
   * Whether the user is validated. Never visible to the API.
   */
  validated: boolean;
  /**
   * The status code.
   */
  statusCode: 200;
  /**
   * The token to use to construct the validate email address url
   */
  token: string;
}