/**
 * The MIT License
 *
 * Copyright (C) 2015 Asterios Raptis
 *
 * Permission is hereby granted, free of charge, to any person obtaining
 * a copy of this software and associated documentation files (the
 * "Software"), to deal in the Software without restriction, including
 * without limitation the rights to use, copy, modify, merge, publish,
 * distribute, sublicense, and/or sell copies of the Software, and to
 * permit persons to whom the Software is furnished to do so, subject to
 * the following conditions:
 *
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
 * MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE
 * LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION
 * OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION
 * WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
package de.alpharogroup.email.messages;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.File;
import java.io.IOException;

import org.junit.jupiter.api.Test;

import io.github.astrapi69.file.search.PathFinder;
import io.github.astrapi69.test.message.TestMessagesExtensions;

/**
 * The unit test class for the class {@link Mimetypes}.
 *
 * @version 1.0
 * @author Asterios Raptis
 */
public class MimetypesTest
{

	/**
	 * Test method for {@link Mimetypes#getMimeType(File)}.
	 *
	 * @throws IOException
	 *             Signals that an I/O exception has occurred.
	 */
	@Test
	public void testGetMimeType() throws IOException
	{
		String expected;
		String actual;
		final File testResoureDir = PathFinder.getSrcTestResourcesDir();
		final File xmlFile = new File(testResoureDir, "testng.xml");
		// check if xml MimeType
		expected = "application/xml";
		actual = Mimetypes.getMimeType(xmlFile);
		assertTrue(expected.equals(actual), TestMessagesExtensions.newFailMessage("Mimetype", expected, actual));
	}

}
