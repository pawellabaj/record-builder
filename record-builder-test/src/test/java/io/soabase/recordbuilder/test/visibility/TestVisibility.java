/**
 * Copyright 2019 Jordan Zimmerman
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.soabase.recordbuilder.test.visibility;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Modifier;

class TestVisibility {
    @Test
    void testMatches() {
        Assertions.assertFalse(Modifier.isPublic(PackagePrivateRecordBuilder.class.getModifiers()));
        Assertions.assertFalse(Modifier.isPrivate(PackagePrivateRecordBuilder.class.getModifiers()));
        Assertions.assertFalse(Modifier.isProtected(PackagePrivateRecordBuilder.class.getModifiers()));

        Assertions.assertTrue(Modifier.isPublic(WrapperProtectedRecordBuilder.class.getModifiers()));
    }


    @Test
    void testMatchesWithModifers() {
        Assertions.assertFalse(Modifier.isPublic(PackagePrivateRecordWithPublicBuilder.class.getModifiers()));
        Assertions.assertFalse(Modifier.isPrivate(PackagePrivateRecordWithPublicBuilder.class.getModifiers()));
        Assertions.assertFalse(Modifier.isProtected(PackagePrivateRecordWithPublicBuilder.class.getModifiers()));

        Assertions.assertTrue(Modifier.isPublic(PackagePrivateRecordWithPublicBuilderBuilder.class.getModifiers()));
    }

}
