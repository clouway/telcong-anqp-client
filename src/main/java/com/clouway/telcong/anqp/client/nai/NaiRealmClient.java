package com.clouway.telcong.anqp.client.nai;

import java.util.List;

/**
 */
public interface NaiRealmClient {
  /**
   * Retrieve encodings for NAI realm list
   *
   * @return list of {@link java.lang.String}
   */
  List<String> fetchEncodings();

  /**
   * Retrieve EAP methods for NAI realm list
   *
   * @return list of {@link java.lang.String}
   */
  List<String> fetchEapMethods();

  /**
   * Retrieve all EAP authentications
   *
   * @return list of {@link com.clouway.telcong.anqp.client.nai.AuthEntry}
   */
  List<AuthEntry> fetchEapAuthentications();

}
