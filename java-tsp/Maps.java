public class Maps {


  // a small 6x4 map
  public static final int SMALL_MAP_WIDTH = 6;
  public static final int SMALL_MAP_HEIGHT = 4;
  public final static char[] SMALL_MAP = (
    "?     " +
    "    . " +
    "  @  ." +
    ".   . ").toCharArray();

  // a medium-sized map
  public static final int MEDIUM_MAP_WIDTH = 10;
  public static final int MEDIUM_MAP_HEIGHT = 6;
  public final static char[] MEDIUM_MAP = (
    "?*   @    " +
    "****    @ " +
    " **  .    " +
    "  @  ~~ .^" +
    ".   ~~~ ^^" +
    " .  .~   .").toCharArray();

  // a large map of a place that Santa is looking forward to visit this Christmas
  public static final int LARGE_MAP_WIDTH = 97;
  public static final int LARGE_MAP_HEIGHT = 57;
  public final static char[] LARGE_MAP = (
    "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~          ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~" +
    "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~         ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~" +
    "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~##########~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~" +
    "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~#        ##~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~" +
    "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~#          #~~~~~~~~~~~~~~~~~~~~~~~~~#####~~~~~~~~~~~~~~~~" +
    "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~#          #~~~~~~## ~~~~~~~~~~~~###   ##~~~~~~~~~~~~~~~~" +
    "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~?~~~~~~##          @ ##### #~~~~~~~~~~####    #~~~~~~~~~~~~~~~~~~~" +
    "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~#                 #~~~~######         #####~~~~~~~~~~~~~~" +
    "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~###             #~~~~~#                   #~~~~~~~~~~~~~~" +
    "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~#~~~~~             #####                    #~~~~~~~~~~~~~~" +
    "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~# ###  ~                                      ####          " +
    "~~~~~~~~~~~~~~~~~~~~~~~~~#########~ ~#       ~~  @            @                       #          " +
    "~~~~~~~~~~~~~~         ~#        #~~#          ~~                     ~~~              #         " +
    "~~~~~~~~~~~              ~#       ##                                     ~             #         " +
    "~~~~~~~~~~               #        @                                                    #         " +
    "~~~~~~~                  #              @                                             #          " +
    "~~~~                    #                                                             #          " +
    "~~~    ~~               #                                                              ###       " +
    "~~~    ~~~           #                                                         @          #      " +
    "~~   ~~~             ###                                                     @           #       " +
    "~                       #                      @       @                                  #      " +
    "                       #                                                                   #     " +
    "                     #              @                           @                          #     " +
    "               ######       @                      ********                               #      " +
    "              #                                  *************                             #     " +
    "               #                               **************                               ##   " +
    "                #    @  @  @                      *********                                   #  " +
    "               #                             @                         @                       # " +
    "              #      @                                                              @    ##     #" +
    "             #                  *******                                                 #  #  ## " +
    "              #       @        * ******                    @                 @         #    ##   " +
    "              #         @      ********                                            ####          " +
    "               #^               * ** *                  ******            ^^^^^^###              " +
    "               ##^^^                                  *********  ^     ^^^^#^###                 " +
    "                #^^^^       @                          ********  ^^  ^^^### #                    " +
    "              ##^^^^                                             ^^^^###                         " +
    "              #^^^^                   @                           ^^^^##                         " +
    "              ##^                @                                ^^^^^^##                       " +
    "                ##^^                           *****                ^^^^^#                       " +
    "                #^^^^                        *****                    ^^^#                       " +
    "                ## ^^^^      ***    @                                   ^^#                      " +
    "                 #^^^^      ****                            @            **###                   " +
    "                  ##  @  ## ***                                          *****##                 " +
    "                    #####  ###                                            ******##               " +
    "                              ###  @          ******                  @     ******###            " +
    "                               #****           *****                           ******#           " +
    "                              #****      @                                      ******#          " +
    "                             #*****                                              *####           " +
    "                            #*****                                                #              " +
    "                           #****                          @                   ####               " +
    "                          #******                               @           ##                   " +
    "                          #**@***                           ~               ^#                   " +
    "                          #******  ##                       ~ ~          ~~ ^^#                  " +
    "                          #****** #  ## ~~~~^^^^^^^^^^^^^^^   ^^^^^^^^ ##^^##^^#                 " +
    "                          ##########   ####~~~~##^^^^^####^^^^^^#######  ##  #^^#                " +
    "                                          #####  #^^^^#   #^^^##              ##                 " +
    "                                                  ####     ###                                   ").toCharArray();
}
