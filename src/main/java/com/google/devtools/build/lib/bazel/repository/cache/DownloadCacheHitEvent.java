// Copyright 2016 The Bazel Authors. All rights reserved.
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

package com.google.devtools.build.lib.bazel.repository.cache;

import com.google.devtools.build.lib.events.ExtendedEventHandler.Postable;
import java.net.URL;

/** Event reporting about cache hits for download requests. */
public final class DownloadCacheHitEvent implements Postable {
  private final String context;
  private final String hash;
  private final URL url;

  public DownloadCacheHitEvent(String context, String hash, URL url) {
    this.context = context;
    this.hash = hash;
    this.url = url;
  }

  public String getContext() {
    return context;
  }

  public URL getUrl() {
    return url;
  }

  public String getFileHash() {
    return hash;
  }
}
