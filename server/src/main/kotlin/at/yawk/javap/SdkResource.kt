/*
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/.
 */

package at.yawk.javap

import javax.inject.Inject
import javax.ws.rs.Consumes
import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType

/**
 * @author yawkat
 */
@Path("/sdk") // /api/sdk
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
class SdkResource @Inject constructor(val sdkProvider: SdkProvider) {
    @GET
    fun listSdks() = sdkProvider.sdks.map { mapOf("name" to it.name, "language" to it.language.name) }
}