/*
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/.
 */

package at.yawk.javap

/**
 * @author yawkat
 */
object SystemSdkProvider : SdkProvider {
    val JDK = "SYSTEM"

    override val defaultSdkByLanguage = mapOf(
            SdkLanguage.JAVA to Sdk(JDK, null, listOf("javac"), SdkLanguage.JAVA)
    )
    override val sdks = defaultSdkByLanguage.values.toList()
}