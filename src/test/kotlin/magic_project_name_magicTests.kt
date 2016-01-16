package magic_group_name_magic

import org.jetbrains.spek.api.Spek
import kotlin.test.assertFails

class magic_project_name_magicTests : Spek() {
	init {
		given("a plugin") {
			val plugin = magic_project_name_magic()

			on("calling apply") {

				it("throws an exception") {
					assertFails { plugin.apply(null) }
				}
			}
		}
	}
}
