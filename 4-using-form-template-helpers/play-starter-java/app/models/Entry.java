/**
 *     ______  ___  Play Framework Starter Guide   ___   Phone Book Example   ___ __
 *    /   _  \/  /__   ______   ______   ______   /  /__   ______   ______   /  /  /
 *   /   ____/   _  \_/   _  \_/   _  \_/   ___\_/   _  \_/   _  \_/   _  \_/     \_
 *   \__/    \__/___/ \______/ \__/___/ \______/ \______/ \______/ \______/\__/____/
 * Published under MIT License. Copyright (c) 2013 Daniel Dietrich, Packt Publishing
 */
package models;

import static play.data.validation.Constraints.*;

public class Entry {

	public Long id;

	@Required
	@MinLength(value = 2)
	public String name;

	@Required
	@Pattern(
		value = "\\+?[0-9\\s]+",
		message = "Optional +, followed by digits & spaces"
	)
	public String phone;

	public Entry() {}

}