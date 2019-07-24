import kotlin.random.Random

fun main (){
    var noun = arrayOf("man", "mountain", "state", "ocean", "country", "building", "cat", "airline", "Sydney", "bridge", "ecosystem", "pipeline", "ivory tower", "grass", "culprit", "decree", "layman", "legislation", "nobility", "offspring")
    var adjectives = arrayOf("attractive", "bald", "beautiful", "chubby", "clean", "dazzling", "drab", "elegant", "unbelievable", "unassuming", "lacklustre", "institutional", "ripe", "bogus", "cerulean", "fastidious", "feckless", "guileless", "execrable", "insolent")
    var verb = arrayOf("cleans", "cuts", "drives", "eats", "flies", "goes", "lives", "makes", "bakes", "cries", "seized", "shatter", "advised", "brooded", "desecrates", "deifies", "decimates", "disparages", "inherits", "vacillates")
    var adverb = arrayOf("angrily", "sadly", "lazily", "slowly", "aggressively", "quickly", "easily", "difficultly", "painfully", "carefully", "viciously", "dreamily", "absentmindedly", "frantically", "gracefully", "loyally", "stylishly", "wishfully", "recklessly", "halfheartedly")

    var adv = Random.nextInt(19) + 0
    var n = Random.nextInt(19) + 0
    var a = Random.nextInt(19) + 0
    var v = Random.nextInt(19) + 0
    var dave = Random.nextInt(19) + 0
    var carl = Random.nextInt(19) + 0
    var abby = Random.nextInt(19) + 0
    var nico = Random.nextInt(19) + 0
    var addison = Random.nextInt(19) + 0
    var veronica = Random.nextInt(19) + 0
    var addy = Random.nextInt(19) + 0
    var vespa = Random.nextInt(19) + 0

    print("The ${adjectives[a]} ${noun[n]} ${adverb[adv]} ${verb[v]}. Then the ${adjectives[a]} ${noun[n]} ${adverb[dave]} ${verb[carl]}. While the ${adjectives[abby]} ${noun[nico]} ${adverb[addison]} ${verb[veronica]}. Next the ${adjectives[a]} ${noun[n]} and the ${adjectives[abby]} ${noun[nico]} ${adverb[addy]} ${verb[vespa]}.")
}