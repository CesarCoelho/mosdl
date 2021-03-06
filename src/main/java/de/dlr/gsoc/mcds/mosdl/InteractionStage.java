// Copyright 2019 DLR - GSOC
// SPDX-License-Identifier: Apache-2.0
package de.dlr.gsoc.mcds.mosdl;

/**
 * Enumeration of all possible MAL interaction pattern interaction stages.
 */
public enum InteractionStage {
	SEND,
	SUBMIT,
	SUBMIT_ACK,
	SUBMIT_ACK_ERROR,
	REQUEST,
	REQUEST_RESPONSE,
	REQUEST_RESPONSE_ERROR,
	INVOKE,
	INVOKE_ACK,
	INVOKE_ACK_ERROR,
	INVOKE_RESPONSE,
	INVOKE_RESPONSE_ERROR,
	PROGRESS,
	PROGRESS_ACK,
	PROGRESS_ACK_ERROR,
	PROGRESS_UPDATE,
	PROGRESS_UPDATE_ERROR,
	PROGRESS_RESPONSE,
	PROGRESS_RESPONSE_ERROR,
	PUBSUB_REGISTER,
	PUBSUB_REGISTER_ACK,
	PUBSUB_REGISTER_ERROR,
	PUBSUB_PUBLISH_REGISTER,
	PUBSUB_PUBLISH_REGISTER_ACK,
	PUBSUB_PUBLISH_REGISTER_ERROR,
	PUBSUB_PUBLISH,
	PUBSUB_PUBLISH_ERROR,
	PUBSUB_NOTIFY,
	PUBSUB_NOTIFY_ERROR,
	PUBSUB_DEREGISTER,
	PUBSUB_DEREGISTER_ACK,
	PUBSUB_PUBLISH_DEREGISTER,
	PUBSUB_PUBLISH_DEREGISTER_ACK;
}
