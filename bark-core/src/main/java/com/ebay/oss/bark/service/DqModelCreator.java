/*
	Copyright (c) 2016 eBay Software Foundation.
	Licensed under the Apache License, Version 2.0 (the "License");
	you may not use this file except in compliance with the License.
	You may obtain a copy of the License at

	    http://www.apache.org/licenses/LICENSE-2.0

	Unless required by applicable law or agreed to in writing, software
	distributed under the License is distributed on an "AS IS" BASIS,
	WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
	See the License for the specific language governing permissions and
	limitations under the License.
 */
package com.ebay.oss.bark.service;

import com.ebay.oss.bark.domain.DqModel;
import com.ebay.oss.bark.vo.ModelInput;

public interface DqModelCreator {

    /** the minimum number of Jobs executed in the ModelStatus.TESTING, and then it could be shifted
     * to ModelStatus.VERIFIED.
     */
    int MIN_TESTING_JOB_NUMBER = 5;

    boolean isSupport(ModelInput input);

    // FIXME the return value here doesn't mean anything
    DqModel newModel(ModelInput input);

}
