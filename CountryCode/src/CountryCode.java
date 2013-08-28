/*
 * Copyright (C) 2012 Neo Visionaries Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


import java.util.HashMap;
import java.util.Map;


/**
 * <a href="http://en.wikipedia.org/wiki/ISO_3166-1">ISO 3166-1</a>
 * country code.
 *
 * <p>
 * Enum names of this enum themselves are represented by
 * <a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO 3166-1 alpha-2</a>
 * codes. There are instance methods to get the country name ({@link #getName()}), the
 * <a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-3" >ISO 3166-1 alpha-3</a>
 * code ({@link #getAlpha3()}) and the
 * <a href="http://en.wikipedia.org/wiki/ISO_3166-1_numeric">ISO 3166-1 numeric</a>
 * code ({@link #getNumeric()}).
 * In addition, there are static methods to get a CountryCode instance that
 * corresponds to a given alpha-2/alpha-3/numeric code ({@link #getByCode(String)},
 * {@link #getByCode(int)}).
 * </p>
 *
 * <pre style="background-color: #EEEEEE; margin-left: 2em; margin-right: 2em; border: 1px solid black;">
 * <span style="color: darkgreen;">// EXAMPLE</span>
 *
 * CountryCode cc = CountryCode.{@link #getByCode(String) getByCode}("JP");
 *
 * <span style="color: darkgreen;">// Country name</span>
 * System.out.println("Country name = " + cc.{@link #getName()});                  <span style="color: darkgreen;">// "Japan"</span>
 *
 * <span style="color: darkgreen;">// ISO 3166-1 alpha-2 code</span>
 * System.out.println("ISO 3166-1 alpha-2 code = " + cc.{@link #getAlpha2()});     <span style="color: darkgreen;">// "JP"</span>
 *
 * <span style="color: darkgreen;">// ISO 3166-1 alpha-3 code</span>
 * System.out.println("ISO 3166-1 alpha-3 code = " + cc.{@link #getAlpha3()});     <span style="color: darkgreen;">// "JPN"</span>
 *
 * <span style="color: darkgreen;">// ISO 3166-1 numeric code</span>
 * System.out.println("ISO 3166-1 numeric code = " + cc.{@link #getNumeric()});    <span style="color: darkgreen;">// 392</span>
 * </pre>
 *
 * @author Takahiko Kawasaki
 */
public enum CountryCode
{
    // @formatter:off
    /** <a href="http://en.wikipedia.org/wiki/Andorra">Andorra</a> */
    AD("Andorra", "AND", 16,376 ),

    /** <a href="http://en.wikipedia.org/wiki/United_Arab_Emirates">United Arab Emirates</a> */
    AE("United Arab Emirates", "ARE", 784,971 ),

    /** <a href="http://en.wikipedia.org/wiki/Afghanistan">Afghanistan</a> */
    AF("Afghanistan", "AFG", 4,93 ),

    /** <a href="http://en.wikipedia.org/wiki/Antigua_and_Barbuda">Antigua and Barbuda</a> */
    AG("Antigua and Barbuda", "ATG", 28,1268 ),

    /** <a href="http://en.wikipedia.org/wiki/Anguilla">Anguilla</a> */
    AI("Anguilla", "AIA", 660,1264 ),

    /** <a href="http://en.wikipedia.org/wiki/Albania">Albania</a> */
    AL("Albania", "ALB", 8,355 ),

    /** <a href="http://en.wikipedia.org/wiki/Armenia">Armenia</a> */
    AM("Armenia", "ARM", 51,374 ),

    /** <a href="http://en.wikipedia.org/wiki/Netherlands_Antilles">Netherlands Antilles</a> */
    AN("Netherlands Antilles", "ANT", 530,599 ),

    /** <a href="http://en.wikipedia.org/wiki/Angola">Angola</a> */
    AO("Angola", "AGO", 24,244 ),

    /** <a href="http://en.wikipedia.org/wiki/Antarctica">Antarctica</a> */
    AQ("Antarctica", "ATA", 10,672 ),

    /** <a href="http://en.wikipedia.org/wiki/Argentina">Argentina</a> */
    AR("Argentina", "ARG", 32,54 ),

    /** <a href="http://en.wikipedia.org/wiki/American_Samoa">American Samoa</a> */
    AS("American Samoa", "ASM", 16,1684),

    /** <a href="http://en.wikipedia.org/wiki/Austria">Austria</a> */
    AT("Austria", "AUT", 40,43),

    /** <a href="http://en.wikipedia.org/wiki/Australia">Australia</a> */
    AU("Australia", "AUS", 36,61 ),

    /** <a href="http://en.wikipedia.org/wiki/Aruba">Aruba</a> */
    AW("Aruba", "ABW", 533,297 ),

    /** <a href="http://en.wikipedia.org/wiki/%C3%85land_Islands">&Aring;land Islands</a> */
    AX("\u212Bland Islands", "ALA", 248,0),

    /** <a href="http://en.wikipedia.org/wiki/Azerbaijan">Azerbaijan</a> */
    AZ("Azerbaijan", "AZE", 31,994 ),

    /** <a href="http://en.wikipedia.org/wiki/Bosnia_and_Herzegovina">Bosnia and Herzegovina</a> */
    BA("Bosnia and Herzegovina", "BIH", 70,387),

    /** <a href="http://en.wikipedia.org/wiki/Barbados">Barbados</a> */
    BB("Barbados", "BRB", 52,1246 ),

    /** <a href="http://en.wikipedia.org/wiki/Bangladesh">Bangladesh</a> */
    BD("Bangladesh", "BGD", 50,880 ),

    /** <a href="http://en.wikipedia.org/wiki/Belgium">Belgium</a> */
    BE("Belgium", "BEL", 56,32),

    /** <a href="http://en.wikipedia.org/wiki/Burkina_Faso">Burkina Faso</a> */
    BF("Burkina Faso", "BFA", 854,226 ),

    /** <a href="http://en.wikipedia.org/wiki/Bulgaria">Bulgaria</a> */
    BG("Bulgaria", "BGR", 100,359 ),

    /** <a href="http://en.wikipedia.org/wiki/Bahrain">Bahrain</a> */
    BH("Bahrain", "BHR", 48,973 ),

    /** <a href="http://en.wikipedia.org/wiki/Burundi">Burundi</a> */
    BI("Burundi", "BDI", 108,257 ),

    /** <a href="http://en.wikipedia.org/wiki/Benin">Benin</a> */
    BJ("Benin", "BEN", 204,229 ),

    /** <a href="http://en.wikipedia.org/wiki/Saint_Barth%C3%A9lemy">Saint Barth&eacute;lemy</a> */
    BL("Saint Barth\u00E9lemy", "BLM", 652,590 ),

    /** <a href="http://en.wikipedia.org/wiki/Bermuda">Bermuda</a> */
    BM("Bermuda", "BMU", 60,1441 ),

    /** <a href="http://en.wikipedia.org/wiki/Brunei">Brunei Darussalam</a> */
    BN("Brunei Darussalam", "BRN", 96,673 ),

    /** <a href="http://en.wikipedia.org/wiki/Bolivia">Plurinational State of Bolivia</a> */
    BO("Plurinational State of Bolivia", "BOL", 68,591 ),

    /** <a href="http://en.wikipedia.org/wiki/Caribbean_Netherlands">Bonaire, Sint Eustatius and Saba</a> */
    BQ("Bonaire, Sint Eustatius and Saba", "BES", 535,0),

    /** <a href="http://en.wikipedia.org/wiki/Brazil">Brazil</a> */
    BR("Brazil", "BRA", 76,55 ),

    /** <a href="http://en.wikipedia.org/wiki/The_Bahamas">Bahamas</a> */
    BS("Bahamas", "BHS", 44,1242),

    /** <a href="http://en.wikipedia.org/wiki/Bhutan">Bhutan</a> */
    BT("Bhutan", "BTN", 64,975 ),

    /** <a href="http://en.wikipedia.org/wiki/Bouvet_Island">Bouvet Island</a> */
    BV("Bouvet Island", "BVT", 74,0),

    /** <a href="http://en.wikipedia.org/wiki/Botswana">Botswana</a> */
    BW("Botswana", "BWA", 72,267),

    /** <a href="http://en.wikipedia.org/wiki/Belarus">Belarus</a> */
    BY("Belarus", "BLR", 112,375 ),

    /** <a href="http://en.wikipedia.org/wiki/Belize">Belize</a> */
    BZ("Belize", "BLZ", 84,501 ),

    /** <a href="http://en.wikipedia.org/wiki/Canada">Canada</a> */
    CA("Canada", "CAN", 124,1),

    /** <a href="http://en.wikipedia.org/wiki/Cocos_(Keeling)_Islands">Cocos (Keeling) Islands</a> */
    CC("Cocos Islands", "CCK", 166,61 ),

    /** <a href="http://en.wikipedia.org/wiki/Democratic_Republic_of_the_Congo">The Democratic Republic of the Congo</a> */
    CD("The Democratic Republic of the Congo", "COD", 180,243 ),

    /** <a href="http://en.wikipedia.org/wiki/Central_African_Republic">Central African Republic</a> */
    CF("Central African Republic", "CAF", 140,236 ),

    /** <a href="http://en.wikipedia.org/wiki/Republic_of_the_Congo">Congo</a> */
    CG("Congo", "COG", 178,242 ),

    /** <a href="http://en.wikipedia.org/wiki/Switzerland">Switzerland</a> */
    CH("Switzerland", "CHE", 756,41 ),

    /** <a href="http://en.wikipedia.org/wiki/C%C3%B4te_d%27Ivoire">C&ocirc;te d'Ivoire</a> */
    CI("C\u00F4te d'Ivoire", "CIV", 384,225 ),

    /** <a href="http://en.wikipedia.org/wiki/Cook_Islands">Cook Islands</a> */
    CK("Cook Islands", "COK", 184,682 ),

    /** <a href="http://en.wikipedia.org/wiki/Chile">Chile</a> */
    CL("Chile", "CHL", 152,56),

    /** <a href="http://en.wikipedia.org/wiki/Cameroon">Cameroon</a> */
    CM("Cameroon", "CMR", 120,237 ),

    /** <a href="http://en.wikipedia.org/wiki/China">China</a> */
    CN("China", "CHN", 156,86 ),

    /** <a href="http://en.wikipedia.org/wiki/Colombia">Colombia</a> */
    CO("Colombia", "COL", 170,57),

    /** <a href="http://en.wikipedia.org/wiki/Costa_Rica">Costa Rica</a> */
    CR("Costa Rica", "CRI", 188,506),

    /** <a href="http://en.wikipedia.org/wiki/Cuba">Cuba</a> */
    CU("Cuba", "CUB", 192,53),

    /** <a href="http://en.wikipedia.org/wiki/Cape_Verde">Cape Verde</a> */
    CV("Cape Verde", "CPV", 132,),

    /** <a href="http://en.wikipedia.org/wiki/Cura%C3%A7ao">Cura&ccedil;ao</a> */
    CW("Cura/u00E7ao", "CUW", 531,238),

    /** <a href="http://en.wikipedia.org/wiki/Christmas_Island">Christmas Island</a> */
    CX("Christmas Island", "CXR", 162,61),

    /** <a href="http://en.wikipedia.org/wiki/Cyprus">Cyprus</a> */
    CY("Cyprus", "CYP", 196,357),

    /** <a href="http://en.wikipedia.org/wiki/Czech_Republic">Czech Republic</a> */
    CZ("Czech Republic", "CZE", 203,420),

    /** <a href="http://en.wikipedia.org/wiki/Germany">Germany</a> */
    DE("Germany", "DEU", 276,49),

    /** <a href="http://en.wikipedia.org/wiki/Djibouti">Djibouti </a> */
    DJ("Djibouti", "DJI", 262,253),

    /** <a href="http://en.wikipedia.org/wiki/Denmark">Denmark</a> */
    DK("Denmark", "DNK", 208,45),

    /** <a href="http://en.wikipedia.org/wiki/Dominica">Dominica</a> */
    DM("Dominica", "DMA", 212,1767),

    /** <a href="http://en.wikipedia.org/wiki/Dominican_Republic">Dominican Republic</a> */
    DO("Dominican Republic", "DOM", 214,1809),

    /** <a href="http://en.wikipedia.org/wiki/Algeria">Algeria</a> */
    DZ("Algeria", "DZA", 12,213),

    /** <a href="http://en.wikipedia.org/wiki/Ecuador">Ecuador</a> */
    EC("Ecuador", "ECU", 218,593),

    /** <a href="http://en.wikipedia.org/wiki/Estonia">Estonia</a> */
    EE("Estonia", "EST", 233,372),

    /** <a href="http://en.wikipedia.org/wiki/Egypt">Egypt</a> */
    EG("Egypt", "EGY", 818,20),

    /** <a href="http://en.wikipedia.org/wiki/Western_Sahara">Western Sahara</a> */
    EH("Western Sahara", "ESH", 732,0),

    /** <a href="http://en.wikipedia.org/wiki/Eritrea">Eritrea</a> */
    ER("Eritrea", "ERI", 232,291),

    /** <a href="http://en.wikipedia.org/wiki/Spain">Spain</a> */
    ES("Spain", "ESP", 724,34),

    /** <a href="http://en.wikipedia.org/wiki/Ethiopia">Ethiopia</a> */
    ET("Ethiopia", "ETH", 231,251),

    /** <a href="http://en.wikipedia.org/wiki/Finland">Finland</a> */
    FI("Finland", "FIN", 246,358),

    /** <a href="http://en.wikipedia.org/wiki/Fiji">Fiji</a> */
    FJ("Fiji", "FJI", 242,679),

    /** <a href="http://en.wikipedia.org/wiki/Falkland_Islands">Falkland Islands (Malvinas)</a> */
    FK("Falkland Islands", "FLK", 238,500),

    /** <a href="http://en.wikipedia.org/wiki/Federated_States_of_Micronesia">Federated States of Micronesia</a> */
    FM("Federated States of Micronesia", "FSM", 583,691),

    /** <a href="http://en.wikipedia.org/wiki/Faroe_Islands">Faroe Islands</a> */
    FO("Faroe Islands", "FRO", 234,298),

    /** <a href="http://en.wikipedia.org/wiki/France">France</a> */
    FR("France", "FRA", 250,33),

    /** <a href="http://en.wikipedia.org/wiki/Gabon">Gabon </a> */
    GA("Gabon", "GAB", 266,241),

    /** <a href="http://en.wikipedia.org/wiki/United_Kingdom">United Kingdom</a> */
    GB("United Kingdom", "GBR", 826,44),

    /** <a href="http://en.wikipedia.org/wiki/Grenada">Grenada</a> */
    GD("Grenada", "GRD", 308,1473),

    /** <a href="http://en.wikipedia.org/wiki/Georgia_(country)">Georgia</a> */
    GE("Georgia", "GEO", 268,995),

    /** <a href="http://en.wikipedia.org/wiki/French_Guiana">French Guiana</a> */
    GF("French Guiana", "GUF", 254,0),

    /** <a href="http://en.wikipedia.org/wiki/Guernsey">Guemsey</a> */
    GG("Guemsey", "GGY", 831,0),

    /** <a href="http://en.wikipedia.org/wiki/Ghana">Ghana</a> */
    GH("Ghana", "GHA", 288,233),

    /** <a href="http://en.wikipedia.org/wiki/Gibraltar">Gibraltar</a> */
    GI("Gibraltar", "GIB", 292,350),

    /** <a href="http://en.wikipedia.org/wiki/Greenland">Greenland</a> */
    GL("Greenland", "GRL", 304,299),

    /** <a href="http://en.wikipedia.org/wiki/The_Gambia">Gambia</a> */
    GM("Gambia", "GMB", 270,220),

    /** <a href="http://en.wikipedia.org/wiki/Guinea">Guinea</a> */
    GN("Guinea", "GIN", 324,224),

    /** <a href="http://en.wikipedia.org/wiki/Guadeloupe">Guadeloupe</a> */
    GP("Guadeloupe", "GLP", 312,0),

    /** <a href="http://en.wikipedia.org/wiki/Equatorial_Guinea">Equatorial Guinea</a> */
    GQ("Equatorial Guinea", "GNQ", 226,240),

    /** <a href="http://en.wikipedia.org/wiki/Greece">Greece</a> */
    GR("Greece", "GRC", 300,30),

    /** <a href="http://en.wikipedia.org/wiki/South_Georgia_and_the_South_Sandwich_Islands">South Georgia and the South Sandwich Islands</a> */
    GS("South Georgia and the South Sandwich Islands", "SGS", 239,0),

    /** <a href="http://en.wikipedia.org/wiki/Guatemala">Guatemala</a> */
    GT("Guatemala", "GTM", 320,502),

    /** <a href="http://en.wikipedia.org/wiki/Guam">Guam</a> */
    GU("Guam", "GUM", 316,1671),

    /** <a href="http://en.wikipedia.org/wiki/Guinea-Bissau">Guinea-Bissau</a> */
    GW("Guinea-Bissau", "GNB", 624,245),

    /** <a href="http://en.wikipedia.org/wiki/Guyana">Guyana</a> */
    GY("Guyana", "GUY", 328,592),

    /** <a href="http://en.wikipedia.org/wiki/Hong_Kong">Hong Kong</a> */
    HK("Hong Kong", "HKG", 344,852),

    /** <a href="http://en.wikipedia.org/wiki/Heard_Island_and_McDonald_Islands">Heard Island and McDonald Islands</a> */
    HM("Heard Island and McDonald Islands", "HMD", 334,0),

    /** <a href="http://en.wikipedia.org/wiki/Honduras">Honduras</a> */
    HN("Honduras", "HND", 340,504),

    /** <a href="http://en.wikipedia.org/wiki/Croatia">Croatia</a> */
    HR("Croatia", "HRV", 191,385),

    /** <a href="http://en.wikipedia.org/wiki/Haiti">Haiti</a> */
    HT("Haiti", "HTI", 332,509),

    /** <a href="http://en.wikipedia.org/wiki/Hungary">Hungary</a> */
    HU("Hungary", "HUN", 348,36),

    /** <a href="http://en.wikipedia.org/wiki/Indonesia">Indonesia</a> */
    ID("Indonesia", "IDN", 360,62),

    /** <a href="http://en.wikipedia.org/wiki/Republic_of_Ireland">Ireland</a> */
    IE("Ireland", "IRL", 372,353),

    /** <a href="http://en.wikipedia.org/wiki/Israel">Israel</a> */
    IL("Israel", "ISR", 376,972),

    /** <a href="http://en.wikipedia.org/wiki/Isle_of_Man">Isle of Man</a> */
    IM("Isle of Man", "IMN", 833,44),

    /** <a href="http://en.wikipedia.org/wiki/India">India</a> */
    IN("India", "IND", 356,91),

    /** <a href="http://en.wikipedia.org/wiki/British_Indian_Ocean_Territory">British Indian Ocean Territory</a> */
    IO("British Indian Ocean Territory", "IOT", 86,0),

    /** <a href="http://en.wikipedia.org/wiki/Iraq">Iraq</a> */
    IQ("Iraq", "IRQ", 368,964),

    /** <a href="http://en.wikipedia.org/wiki/Iran">Islamic Republic of Iran</a> */
    IR("Islamic Republic of Iran", "IRN", 364,98),

    /** <a href="http://en.wikipedia.org/wiki/Iceland">Iceland</a> */
    IS("Iceland", "ISL", 352,354),

    /** <a href="http://en.wikipedia.org/wiki/Italy">Italy</a> */
    IT("Italy", "ITA", 380,39),

    /** <a href="http://en.wikipedia.org/wiki/Jersey">Jersey</a> */
    JE("Jersey", "JEY", 832,0),

    /** <a href="http://en.wikipedia.org/wiki/Jamaica">Jamaica</a> */
    JM("Jamaica", "JAM", 388,1876),

    /** <a href="http://en.wikipedia.org/wiki/Jordan">Jordan</a> */
    JO("Jordan", "JOR", 400,962),

    /** <a href="http://en.wikipedia.org/wiki/Japan">Japan</a> */
    JP("Japan", "JPN", 392,81),

    /** <a href="http://en.wikipedia.org/wiki/Kenya">Kenya</a> */
    KE("Kenya", "KEN", 404,254),

    /** <a href="http://en.wikipedia.org/wiki/Kyrgyzstan">Kyrgyzstan</a> */
    KG("Kyrgyzstan", "KGZ", 417,996),

    /** <a href="http://en.wikipedia.org/wiki/Cambodia">Cambodia</a> */
    KH("Cambodia", "KHM", 116,855),

    /** <a href="http://en.wikipedia.org/wiki/Kiribati">Kiribati</a> */
    KI("Kiribati", "KIR", 296,686),

    /** <a href="http://en.wikipedia.org/wiki/Comoros">Comoros</a> */
    KM("Comoros", "COM", 174,269),

    /** <a href="http://en.wikipedia.org/wiki/Saint_Kitts_and_Nevis">Saint Kitts and Nevis</a> */
    KN("Saint Kitts and Nevis", "KNA", 659,1869),

    /** <a href="http://en.wikipedia.org/wiki/North_Korea">Democratic People's Republic of Korea</a> */
    KP("Democratic People's Republic of Korea", "PRK", 408,850),

    /** <a href="http://en.wikipedia.org/wiki/South_Korea">Republic of Korea</a> */
    KR("Republic of Korea", "KOR", 410,82),

    /** <a href="http://en.wikipedia.org/wiki/Kuwait">Kuwait</a> */
    KW("Kuwait", "KWT", 414,965),

    /** <a href="http://en.wikipedia.org/wiki/Cayman_Islands">Cayman Islands</a> */
    KY("Cayman Islands", "CYM", 136,1345),

    /** <a href="http://en.wikipedia.org/wiki/Kazakhstan">Kazakhstan</a> */
    KZ("Kazakhstan", "KAZ", 398,7),

    /** <a href="http://en.wikipedia.org/wiki/Laos">Lao People's Democratic Republic</a> */
    LA("Lao People's Democratic Republic", "LAO", 418,856),

    /** <a href="http://en.wikipedia.org/wiki/Lebanon">Lebanon</a> */
    LB("Lebanon", "LBN", 422,961),

    /** <a href="http://en.wikipedia.org/wiki/Saint_Lucia">Saint Lucia</a> */
    LC("Saint Lucia", "LCA", 662,1758),

    /** <a href="http://en.wikipedia.org/wiki/Liechtenstein">Liechtenstein</a> */
    LI("Liechtenstein", "LIE", 438,423),

    /** <a href="http://en.wikipedia.org/wiki/Sri_Lanka">Sri Lanka</a> */
    LK("Sri Lanka", "LKA", 144,94),

    /** <a href="http://en.wikipedia.org/wiki/Liberia">Liberia</a> */
    LR("Liberia", "LBR", 430,231),

    /** <a href="http://en.wikipedia.org/wiki/Lesotho">Lesotho</a> */
    LS("Lesotho", "LSO", 426,266),

    /** <a href="http://en.wikipedia.org/wiki/Lithuania">Lithuania</a> */
    LT("Lithuania", "LTU", 440,370),

    /** <a href="http://en.wikipedia.org/wiki/Luxembourg">Luxembourg</a> */
    LU("Luxembourg", "LUX", 442,352),

    /** <a href="http://en.wikipedia.org/wiki/Latvia">Latvia</a> */
    LV("Latvia", "LVA", 428,371),

    /** <a href="http://en.wikipedia.org/wiki/Libya">Libya</a> */
    LY("Libya", "LBY", 434,218),

    /** <a href="http://en.wikipedia.org/wiki/Morocco">Morocco</a> */
    MA("Morocco", "MAR", 504,212),

    /** <a href="http://en.wikipedia.org/wiki/Monaco">Monaco</a> */
    MC("Monaco", "MCO", 492,377),

    /** <a href="http://en.wikipedia.org/wiki/Moldova">Republic of Moldova</a> */
    MD("Republic of Moldova", "MDA", 498,373),

    /** <a href="http://en.wikipedia.org/wiki/Montenegro">Montenegro</a> */
    ME("Montenegro", "MNE", 499,382),

    /** <a href="http://en.wikipedia.org/wiki/Collectivity_of_Saint_Martin">Saint Martin (French part)</a> */
    MF("Saint Martin", "MAF", 663,1599),

    /** <a href="http://en.wikipedia.org/wiki/Madagascar">Madagascar</a> */
    MG("Madagascar", "MDG",450,261),

    /** <a href="http://en.wikipedia.org/wiki/Marshall_Islands">Marshall Islands</a> */
    MH("Marshall Islands", "MHL", 584,692),

    /** <a href="http://en.wikipedia.org/wiki/Republic_of_Macedonia">The former Yugoslav Republic of Macedonia</a> */
    MK("The former Yugoslav Republic of Macedonia", "MKD", 807,389),

    /** <a href="http://en.wikipedia.org/wiki/Mali">Mali</a> */
    ML("Mali", "MLI", 466,223),

    /** <a href="http://en.wikipedia.org/wiki/Myanmar">Myanmar</a> */
    MM("Myanmar", "MMR", 104,95),

    /** <a href="http://en.wikipedia.org/wiki/Mongolia">Mongolia</a> */
    MN("Mongolia", "MNG", 496,976),

    /** <a href="http://en.wikipedia.org/wiki/Macau">Macao</a> */
    MO("Macao", "MCO", 492,853),

    /** <a href="http://en.wikipedia.org/wiki/Northern_Mariana_Islands">Northern Mariana Islands</a> */
    MP("Northern Mariana Islands", "MNP",580,1670),

    /** <a href="http://en.wikipedia.org/wiki/Martinique">Martinique</a> */
    MQ("Martinique", "MTQ", 474,0),

    /** <a href="http://en.wikipedia.org/wiki/Mauritania">Mauritania</a> */
    MR("Mauritania", "MRT", 478,222),

    /** <a href="http://en.wikipedia.org/wiki/Montserrat">Montserrat</a> */
    MS("Montserrat", "MSR", 500,1664),

    /** <a href="http://en.wikipedia.org/wiki/Malta">Malta</a> */
    MT("Malta", "MLT", 470,356),

    /** <a href="http://en.wikipedia.org/wiki/Mauritius">Mauritius</a> */
    MU("Mauritius", "MUS", 480,230),

    /** <a href="http://en.wikipedia.org/wiki/Maldives">Maldives</a> */
    MV("Maldives", "MDV", 462,960),

    /** <a href="http://en.wikipedia.org/wiki/Malawi">Malawi</a> */
    MW("Malawi", "MWI", 454,265),

    /** <a href="http://en.wikipedia.org/wiki/Mexico">Mexico</a> */
    MX("Mexico", "MEX", 484,52),

    /** <a href="http://en.wikipedia.org/wiki/Malaysia">Malaysia</a> */
    MY("Malaysia", "MYS", 458,60),

    /** <a href="http://en.wikipedia.org/wiki/Mozambique">Mozambique</a> */
    MZ("Mozambique", "MOZ", 508,258),

    /** <a href="http://en.wikipedia.org/wiki/Namibia">Namibia</a> */
    NA("Namibia", "NAM", 516,264),

    /** <a href="http://en.wikipedia.org/wiki/New_Caledonia">New Caledonia</a> */
    NC("New Caledonia", "NCL", 540,687),

    /** <a href="http://en.wikipedia.org/wiki/Niger">Niger</a> */
    NE("Niger", "NER", 562,227),

    /** <a href="http://en.wikipedia.org/wiki/Norfolk_Island">Norfolk Island</a> */
    NF("Norfolk Island", "NFK", 574,0),

    /** <a href="http://en.wikipedia.org/wiki/Nigeria">Nigeria</a> */
    NG("Nigeria","NGA", 566,234),

    /** <a href="http://en.wikipedia.org/wiki/Nicaragua">Nicaragua</a> */
    NI("Nicaragua", "NIC", 558,505),

    /** <a href="http://en.wikipedia.org/wiki/Netherlands">Netherlands</a> */
    NL("Netherlands", "NLD", 528,31),

    /** <a href="http://en.wikipedia.org/wiki/Norway">Norway</a> */
    NO("Norway", "NOR", 578,47),

    /** <a href="http://en.wikipedia.org/wiki/Nepal">Nepal</a> */
    NP("Nepal", "NPL", 524,977),

    /** <a href="http://en.wikipedia.org/wiki/Nauru">Nauru</a> */
    NR("Nauru", "NRU", 520,674),

    /** <a href="http://en.wikipedia.org/wiki/Niue">Niue</a> */
    NU("Niue", "NIU", 570,683),

    /** <a href="http://en.wikipedia.org/wiki/New_Zealand">New Zealand</a> */
    NZ("New Zealand", "NZL", 554,64),

    /** <a href=http://en.wikipedia.org/wiki/Oman"">Oman</a> */
    OM("Oman", "OMN", 512,968),

    /** <a href="http://en.wikipedia.org/wiki/Panama">Panama</a> */
    PA("Panama", "PAN", 591,507),

    /** <a href="http://en.wikipedia.org/wiki/Peru">Peru</a> */
    PE("Peru", "PER", 604,51),

    /** <a href="http://en.wikipedia.org/wiki/French_Polynesia">French Polynesia</a> */
    PF("French Polynesia", "PYF", 258,689),

    /** <a href="http://en.wikipedia.org/wiki/Papua_New_Guinea">Papua New Guinea</a> */
    PG("Papua New Guinea", "PNG", 598,675),

    /** <a href="http://en.wikipedia.org/wiki/Philippines">Philippines</a> */
    PH("Philippines", "PHL", 608,63),

    /** <a href="http://en.wikipedia.org/wiki/Pakistan">Pakistan</a> */
    PK("Pakistan", "PAK", 586,92),

    /** <a href="http://en.wikipedia.org/wiki/Poland">Poland</a> */
    PL("Poland", "POL", 616,48),

    /** <a href="http://en.wikipedia.org/wiki/Saint_Pierre_and_Miquelon">Saint Pierre and Miquelon</a> */
    PM("Saint Pierre and Miquelon", "SPM", 666,508),

    /** <a href="http://en.wikipedia.org/wiki/Pitcairn_Islands">Pitcairn</a> */
    PN("Pitcairn", "PCN", 612,870),

    /** <a href="http://en.wikipedia.org/wiki/Puerto_Rico">Puerto Rico</a> */
    PR("Puerto Rico", "PRI", 630,1),

    /** <a href="http://en.wikipedia.org/wiki/Palestinian_territories">Occupied Palestinian Territory</a> */
    PS("Occupied Palestinian Territory", "PSE", 275,970),

    /** <a href="http://en.wikipedia.org/wiki/Portugal">Portugal</a> */
    PT("Portugal", "PRT", 620,351),

    /** <a href="http://en.wikipedia.org/wiki/Palau">Palau</a> */
    PW("Palau", "PLW", 585,680),

    /** <a href="http://en.wikipedia.org/wiki/Paraguay">Paraguay</a> */
    PY("Paraguay", "PRY", 600,595),

    /** <a href="http://en.wikipedia.org/wiki/Qatar">Qatar</a> */
    QA("Qatar", "QAT", 634,974),

    /** <a href="http://en.wikipedia.org/wiki/R%C3%A9union">R&eacute;union</a> */
    RE("R\u00E9union", "REU", 638,0),

    /** <a href="http://en.wikipedia.org/wiki/Romania">Romania</a> */
    RO("Romania", "ROU", 642,40),

    /** <a href="http://en.wikipedia.org/wiki/Serbia">Serbia</a> */
    RS("Serbia", "SRB", 688,381),

    /** <a href="http://en.wikipedia.org/wiki/Russia">Russian Federation</a> */
    RU("Russian Federation", "RUS", 643,7),

    /** <a href="http://en.wikipedia.org/wiki/Rwanda">Rwanda</a> */
    RW("Rwanda", "RWA", 646,250),

    /** <a href="http://en.wikipedia.org/wiki/Saudi_Arabia">Saudi Arabia</a> */
    SA("Saudi Arabia", "SAU", 682,966),

    /** <a href="http://en.wikipedia.org/wiki/Solomon_Islands">Solomon Islands</a> */
    SB("Solomon Islands", "SLB", 90,677),

    /** <a href="http://en.wikipedia.org/wiki/Seychelles">Seychelles</a> */
    SC("Seychelles", "SYC", 690,248),

    /** <a href="http://en.wikipedia.org/wiki/Sudan">Sudan</a> */
    SD("Sudan", "SDN", 729,249),

    /** <a href="http://en.wikipedia.org/wiki/Sweden">Sweden</a> */
    SE("Sweden", "SWE", 752,46),

    /** <a href="http://en.wikipedia.org/wiki/Singapore">Singapore</a> */
    SG("Singapore", "SGP", 702,65),

    /** <a href="http://en.wikipedia.org/wiki/Saint_Helena,_Ascension_and_Tristan_da_Cunha">Saint Helena, Ascension and Tristan da Cunha</a> */
    SH("Saint Helena, Ascension and Tristan da Cunha", "SHN", 654,290),

    /** <a href="http://en.wikipedia.org/wiki/Slovenia">Slovenia</a> */
    SI("Slovenia", "SVN", 705,386),

    /** <a href="http://en.wikipedia.org/wiki/Svalbard_and_Jan_Mayen">Svalbard and Jan Mayen</a> */
    SJ("Svalbard and Jan Mayen", "SJM", 744,0),

    /** <a href="http://en.wikipedia.org/wiki/Slovakia">Slovakia</a> */
    SK("Slovakia", "SVK", 703,421),

    /** <a href="http://en.wikipedia.org/wiki/Sierra_Leone">Sierra Leone</a> */
    SL("Sierra Leone", "SLE", 694,232),

    /** <a href="http://en.wikipedia.org/wiki/San_Marino">San Marino</a> */
    SM("San Marino", "SMR", 674,378),

    /** <a href="http://en.wikipedia.org/wiki/Senegal">Senegal</a> */
    SN("Senegal", "SEN", 686,221),

    /** <a href="http://en.wikipedia.org/wiki/Somalia">Somalia</a> */
    SO("Somalia", "SOM", 706,252),

    /** <a href="http://en.wikipedia.org/wiki/Suriname">Suriname</a> */
    SR("Suriname", "SUR", 740,597),

    /** <a href="http://en.wikipedia.org/wiki/South_Sudan">South Sudan</a> */
    SS("South Sudan", "SSD", 728,0),

    /** <a href="http://en.wikipedia.org/wiki/S%C3%A3o_Tom%C3%A9_and_Pr%C3%ADncipe">Sao Tome and Principe</a> */
    ST("Sao Tome and Principe", "STP", 678,239),

    /** <a href="http://en.wikipedia.org/wiki/El_Salvador">El Salvador</a> */
    SV("El Salvador", "SLV", 222,503),

    /** <a href="http://en.wikipedia.org/wiki/Sint_Maarten">Sint Maarten (Dutch part)</a> */
    SX("Sint Maarten", "SXM", 534,0),

    /** <a href="http://en.wikipedia.org/wiki/Syria">Syrian Arab Republic</a> */
    SY("Syrian Arab Republic", "SYR", 760,963),

    /** <a href="http://en.wikipedia.org/wiki/Swaziland">Swaziland</a> */
    SZ("Swaziland", "SWZ", 748,268),

    /** <a href="http://en.wikipedia.org/wiki/Turks_and_Caicos_Islands">Turks and Caicos Islands</a> */
    TC("Turks and Caicos Islands", "TCA", 796,1649),

    /** <a href="http://en.wikipedia.org/wiki/Chad">Chad</a> */
    TD("Chad", "TCD", 148,235),

    /** <a href="http://en.wikipedia.org/wiki/French_Southern_and_Antarctic_Lands">French Southern Territories</a> */
    TF("French Southern Territories", "ATF", 260,0),

    /** <a href="http://en.wikipedia.org/wiki/Togo">Togo</a> */
    TG("Togo", "TGO", 768,228),

    /** <a href="http://en.wikipedia.org/wiki/Thailand">Thailand</a> */
    TH("Thailand", "THA", 764,66),

    /** <a href="http://en.wikipedia.org/wiki/Tajikistan">Tajikistan</a> */
    TJ("Tajikistan", "TJK", 762,992),

    /** <a href="http://en.wikipedia.org/wiki/Tokelau">Tokelau</a> */
    TK("Tokelau", "TKL", 772,690),

    /** <a href="http://en.wikipedia.org/wiki/East_Timor">Timor-Leste</a> */
    TL("Timor-Leste", "TLS", 626,670),

    /** <a href="http://en.wikipedia.org/wiki/Turkmenistan">Turkmenistan</a> */
    TM("Turkmenistan", "TKM", 795,993),

    /** <a href="http://en.wikipedia.org/wiki/Tunisia">Tunisia</a> */
    TN("Tunisia", "TUN", 788,216),

    /** <a href="http://en.wikipedia.org/wiki/Tonga">Tonga</a> */
    TO("Tonga", "TON", 776,676),

    /** <a href="http://en.wikipedia.org/wiki/Turkey">Turkey</a> */
    TR("Turkey", "TUR", 792,90),

    /** <a href="http://en.wikipedia.org/wiki/Trinidad_and_Tobago">Trinidad and Tobago</a> */
    TT("Trinidad and Tobago", "TTO", 780,1868),

    /** <a href="http://en.wikipedia.org/wiki/Tuvalu">Tuvalu</a> */
    TV("Tuvalu", "TUV", 798,688),

    /** <a href="http://en.wikipedia.org/wiki/Taiwan">Taiwan, Province of China</a> */
    TW("Taiwan, Province of China", "TWN", 158,886),

    /** <a href="http://en.wikipedia.org/wiki/Tanzania">United Republic of Tanzania</a> */
    TZ("United Republic of Tanzania", "TZA", 834,255),

    /** <a href="http://en.wikipedia.org/wiki/Ukraine">Ukraine</a> */
    UA("Ukraine", "UKR", 804,380),

    /** <a href="http://en.wikipedia.org/wiki/Uganda">Uganda</a> */
    UG("Uganda", "UGA", 800,256),

    /** <a href="http://en.wikipedia.org/wiki/United_States_Minor_Outlying_Islands">United States Minor Outlying Islands</a> */
    UM("United States Minor Outlying Islands", "UMI", 581,1),

    /** <a href="http://en.wikipedia.org/wiki/United_States">United States</a> */
    US("United States", "USA", 840,1),

    /** <a href="http://en.wikipedia.org/wiki/Uruguay">Uruguay</a> */
    UY("Uruguay", "URY", 858,598),

    /** <a href="http://en.wikipedia.org/wiki/Uzbekistan">Uzbekistan</a> */
    UZ("Uzbekistan", "UZB", 860,998),

    /** <a href="http://en.wikipedia.org/wiki/Vatican_City">Holy See (Vatican City State)</a> */
    VA("Holy See", "VAT", 336,39),

    /** <a href="http://en.wikipedia.org/wiki/Saint_Vincent_and_the_Grenadines">Saint Vincent and the Grenadines</a> */
    VC("Saint Vincent and the Grenadines", "VCT", 670,1784),

    /** <a href="http://en.wikipedia.org/wiki/Venezuela">Bolivarian Republic of Venezuela</a> */
    VE("Bolivarian Republic of Venezuela", "VEN", 862,58),

    /** <a href="http://en.wikipedia.org/wiki/British_Virgin_Islands">British Virgin Islands</a> */
    VG("British Virgin Islands", "VGB", 92,1284),

    /** <a href="http://en.wikipedia.org/wiki/United_States_Virgin_Islands">Virgin Islands, U.S.</a> */
    VI("Virgin Islands, U.S.", "VIR", 850,1340),

    /** <a href="http://en.wikipedia.org/wiki/Vietnam">Viet Nam</a> */
    VN("Viet Nam", "VNM", 704,84),

    /** <a href="http://en.wikipedia.org/wiki/Vanuatu">Vanuatu</a> */
    VU("Vanuatu", "VUT", 548,678),

    /** <a href="http://en.wikipedia.org/wiki/Wallis_and_Futuna">Wallis and Futuna</a> */
    WF("Wallis and Futuna", "WLF", 876,681),

    /** <a href="http://en.wikipedia.org/wiki/Samoa">Samoa</a> */
    WS("Samoa", "WSM", 882,685),

    /** <a href="http://en.wikipedia.org/wiki/Yemen">Yemen</a> */
    YE("Yemen", "YEM", 887,967),

    /** <a href="http://en.wikipedia.org/wiki/Mayotte">Mayotte</a> */
    YT("Mayotte", "MYT", 175,262),

    /** <a href="http://en.wikipedia.org/wiki/South_Africa">South Africa</a> */
    ZA("South Africa", "ZAF", 710,27),

    /** <a href="http://en.wikipedia.org/wiki/Zambia">Zambia</a> */
    ZM("Zambia", "ZMB", 894,260),

    /** <a href="http://en.wikipedia.org/wiki/Zimbabwe">Zimbabwe</a> */
    ZW("Zimbabwe", "ZWE", 716,263),
    ;
    // @formatter:on


    private static final Map<String, CountryCode> alpha3Map = new HashMap<String, CountryCode>();
    private static final Map<Integer, CountryCode> numericMap = new HashMap<Integer, CountryCode>();


    static
    {
        for (CountryCode cc : values())
        {
            alpha3Map.put(cc.getAlpha3(), cc);
            numericMap.put(cc.getNumeric(), cc);
        }
    }


    private final String name;
    private final String alpha3;
    private final int numeric;
    private final int countryCode;


    private CountryCode(String name, String alpha3, int numeric, int countryPrefix)
    {
        this.name = name;
        this.alpha3 = alpha3;
        this.numeric = numeric;
        this.countryPrefix = countryPrefix;
    }


    /**
     * Get the country name.
     *
     * @return
     *         The country name.
     */
    public String getName()
    {
        return name;
    }


    /**
     * Get the <a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2"
     * >ISO 3166-1 alpha-2</a> code.
     *
     * @return
     *         The <a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2"
     *         >ISO 3166-1 alpha-2</a> code.
     */
    public String getAlpha2()
    {
        return name();
    }


    /**
     * Get the <a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-3"
     * >ISO 3166-1 alpha-3</a> code.
     *
     * @return
     *         The <a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-3"
     *         >ISO 3166-1 alpha-3</a> code.
     */
    public String getAlpha3()
    {
        return alpha3;
    }


    /**
     * Get the <a href="http://en.wikipedia.org/wiki/ISO_3166-1_numeric"
     * >ISO 3166-1 numeric</a> code.
     *
     * @return
     *         The <a href="http://en.wikipedia.org/wiki/ISO_3166-1_numeric"
     *         >ISO 3166-1 numeric</a> code.
     */
    public int getNumeric()
    {
        return numeric;
    }

    public int getCountryPrefix()
    {
        return countryPrefix;
    }

    /**
     * Get a CountryCode that corresponds to a given ISO 3166-1
     * <a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">alpha-2</a> or
     * <a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-3">alpha-3</a> code.
     *
     * @param code
     *         An ISO 3166-1 <a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2"
     *         >alpha-2</a> or <a href="http://en.wikipedia.org/wiki/ISO_3166-1_alpha-3"
     *         >alpha-3</a> code.
     *
     * @return
     *         A CountryCode instance, or null if not found.
     */
    public static CountryCode getByCode(String code)
    {
        if (code == null)
        {
            return null;
        }

        switch (code.length())
        {
            case 2:
                return getByAlpha2Code(code);

            case 3:
                return getByAlpha3Code(code);

            default:
                return null;
        }
    }


    private static CountryCode getByAlpha2Code(String code)
    {
        try
        {
            return Enum.valueOf(CountryCode.class, code);
        }
        catch (IllegalArgumentException e)
        {
            return null;
        }
    }


    private static CountryCode getByAlpha3Code(String code)
    {
        return alpha3Map.get(code);
    }


    /**
     * Get a CountryCode that corresponds to a given
     * <a href="http://en.wikipedia.org/wiki/ISO_3166-1_numeric">ISO 3166-1
     * numeric</a> code.
     *
     * @param code
     *         An <a href="http://en.wikipedia.org/wiki/ISO_3166-1_numeric"
     *         >ISO 3166-1 numeric</a> code.
     *
     * @return
     *         A CountryCode instance, or null if not found.
     */
    public static CountryCode getByCode(int code)
    {
        return numericMap.get(code);
    }
}
