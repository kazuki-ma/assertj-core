/*
 * Created on Jan 29, 2011
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the
 * License. You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS"
 * BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 * 
 * Copyright @2011 the original author or authors.
 */
package org.assertj.core.assertions.error;

import static junit.framework.Assert.assertEquals;
import static org.assertj.core.assertions.error.ShouldNotExist.shouldNotExist;


import org.assertj.core.assertions.description.Description;
import org.assertj.core.assertions.error.ErrorMessageFactory;
import org.assertj.core.assertions.error.ShouldNotExist;
import org.assertj.core.assertions.internal.TestDescription;
import org.junit.*;

/**
 * Tests for <code>{@link ShouldNotExist#create(Description)}</code>.
 * 
 * @author Yvonne Wang
 */
public class ShouldNotExist_create_Test {

  private ErrorMessageFactory factory;

  @Before
  public void setUp() {
    factory = shouldNotExist(new FakeFile("xyz"));
  }

  @Test
  public void should_create_error_message() {
    String message = factory.create(new TestDescription("Test"));
    assertEquals("[Test] expecting file:<xyz> not to exist", message);
  }
}