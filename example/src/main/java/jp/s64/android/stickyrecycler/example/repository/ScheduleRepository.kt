/*
 * Copyright (C) 2017 Shuma Yoshioka
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package jp.s64.android.stickyrecycler.example.repository

import io.reactivex.Single
import jp.s64.android.stickyrecycler.example.api.ISchedulesApi
import jp.s64.android.stickyrecycler.example.model.Schedule
import javax.inject.Inject

class ScheduleRepository @Inject constructor(private val api: ISchedulesApi) {

    fun schedules(): Single<List<Schedule>> = api.schedules()

}
