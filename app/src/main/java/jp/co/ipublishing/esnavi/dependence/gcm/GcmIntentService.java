/*
 * Copyright 2015 iPublishing Co., Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package jp.co.ipublishing.esnavi.dependence.gcm;

import android.app.Notification;
import android.support.annotation.NonNull;

import jp.co.ipublishing.aeskit.alert.models.Alert;
import jp.ipublishing.hinan_navi_android.R;

/**
 * GCM受信サービスの本実装。
 */
public class GcmIntentService extends jp.co.ipublishing.esnavi.impl.gcm.GcmIntentService {
    @Override
    protected void onPreSendNotification(@NonNull Notification.Builder builder, @NonNull Alert alert) {
        builder
                .setSmallIcon(R.mipmap.ic_launcher)
                .setContentTitle(getResources().getString(R.string.app_name));
    }
}
