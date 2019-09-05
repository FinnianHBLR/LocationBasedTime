/*
 * Copyright 2019 Nova-472, JoeZwet
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

package tech.teamio.lbt;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeUtil {
    public static long calTime() {
        DateFormat hours = new SimpleDateFormat("HH");
        DateFormat minutes = new SimpleDateFormat("mm");
        Date date = new Date();
        String hoursStr = hours.format(date);
        String minutesStr = minutes.format(date);

        double temp = (( Integer.parseInt(hoursStr)* 1000 ) - 6000 ) + ( Integer.parseInt(minutesStr)* 16.7 );
        return (long)temp;
    }
}
