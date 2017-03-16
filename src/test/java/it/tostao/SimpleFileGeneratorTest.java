package it.tostao;

import com.google.common.collect.Lists;
import org.junit.Test;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Slawomir Leski <slawomir.leski@gmail.com> on 16.03.17.
 */
public class SimpleFileGeneratorTest {

	@Test
	public void shouldGenerateFileWithUnixLineEnding() throws Exception {

		Path resourceDirectory = Paths.get("src/test/resources");
		File tempFile = new File(resourceDirectory.toFile(), "test.txt");
		//UNIX
		//System.setProperty("line.separator", "\n");
		//WINDOWS
		//System.setProperty("line.separator", "\r\n");
		final String sampleText = "This is line nb: ";
		final List<String> toSave = new ArrayList<String>();
		for (int counter = 0; counter < 4; counter++) {
			toSave.add(sampleText + counter);
		}
		Files.write(tempFile.toPath(), Lists.newArrayList(toSave));
	}
}
