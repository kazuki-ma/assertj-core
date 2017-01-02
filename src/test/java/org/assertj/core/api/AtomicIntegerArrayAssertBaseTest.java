/**
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 *
 * Copyright 2012-2016 the original author or authors.
 */
package org.assertj.core.api;

import static org.assertj.core.test.IntArrays.emptyArray;
import static org.assertj.core.util.Arrays.array;
import static org.mockito.Mockito.mock;

import java.util.concurrent.atomic.AtomicIntegerArray;

import org.assertj.core.internal.IntArrays;

public abstract class AtomicIntegerArrayAssertBaseTest extends BaseTestTemplate<AtomicIntegerArrayAssert, AtomicIntegerArray> {
  protected IntArrays arrays;

  @Override
  protected AtomicIntegerArrayAssert create_assertions() {
    return new AtomicIntegerArrayAssert(new AtomicIntegerArray(emptyArray()));
  }

  @Override
  protected void inject_internal_objects() {
    super.inject_internal_objects();
    arrays = mock(IntArrays.class);
    assertions.arrays = arrays;
  }
  
  protected IntArrays getArrays(AtomicIntegerArrayAssert someAssertions) {
    return someAssertions.arrays;
  }

  protected int[] internalArray() {
    return array(getActual(assertions));
  }

  protected AssertionInfo info() {
    return getInfo(assertions);
  }
}