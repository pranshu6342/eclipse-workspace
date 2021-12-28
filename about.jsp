<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>UNION</title>
</head>
<body>
<img alt="" src="data:image/png;base64,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" width="300cm" height="200cm" style="padding-left:500px ">
	
<p>We have presented here certain Information about Union Bank of India which will help you understand more about our Bank – 
our profile, our aspirations, our leadership team, the banking and other policies we have adopted etc.
 You will also find information regarding the Bank’s 
performance, which will be of special interest to shareholders of the Bank.</p>
Our Training System, Careers with us, our Know Your Customer systems and our Risk Management systems are discussed in this section of the site. We also disclose the Corporate Social Responsibility initiatives which our Bank has undertaken	
	
Union Bank of India is one of the leading public sector banks of the country. The Bank is a listed entity and the Government of India holds 83.50 percent in Bank’s total share capital. The Bank, having its headquarters at Mumbai (India), was registered on November 11, 1919 as a limited company. Recently, Andhra Bank and Corporation Bank were amalgamated into Union Bank of India with effect from 01.04.2020. Today, it has a network of 9200+ domestic branches, 11600+ ATMs, 8216 BC Points serving over 120 million customers with 76000+ employees .The Bank’s total business as of 30th September 2021 stood at Rs.15,48,605 crore, comprising Rs. 9,14,022 crore of deposits and Rs. 6,34,583 crore of advances as of 30th September 2021. The Bank also has 3 branches overseas at Hong Kong, Dubai International Financial Centre (UAE) & Sydney (Australia); 1 representative office in Abu Dhabi (UAE); 1 banking subsidiary at London (UK); 1 banking joint venture in Malaysia; 4 para-banking subsidiaries (domestic); 3 joint ventures(including 2 in life insurance business) and 1 associate - Chaitanya Godavari Gramin Bank. Union Bank of India is the first large public sector bank in the country to have implemented 100% core banking solution. The Bank has received several awards and recognition for its prowess in technology, digital banking, financial inclusion, MSME and development of human resources.	

	<p>Improvements|Online Grievance Redressal new|Skip to main content|Screen
	reader|RBI Kehta Hai Decrease font size Reset font size Increase font
	size Search here Union Bank Of India | Bank Products Digital Banking
	Investor Relations About Us Others We Care Amalgamation Center Home You
	are here : path About Us path Profile path Profile Image About Us About
	Union Bank of India Union Bank of India is one of the leading public
	sector banks of the country. The Bank is a listed entity and the
	Government of India holds 83.50 percent in Bank’s total share capital.
	The Bank, having its headquarters at Mumbai (India), was registered on
	November 11, 1919 as a limited company. Recently, Andhra Bank and
	Corporation Bank were amalgamated into Union Bank of India with effect
	from 01.04.2020. Today, it has a network of 9200+ domestic branches,
	11600+ ATMs, 8216 BC Points serving over 120 million customers with
	76000+ employees .The Bank’s total business as of 30th September 2021
	stood at Rs.15,48,605 crore, comprising Rs. 9,14,022 crore of deposits
	and Rs. 6,34,583 crore of advances as of 30th September 2021. The Bank
	also has 3 branches overseas at Hong Kong, Dubai International
	<p>Financial Centre (UAE) & Sydney (Australia); 1 representative office in
	Abu Dhabi (UAE); 1 banking subsidiary at London (UK); 1 banking joint
	venture in Malaysia; 4 para-banking subsidiaries (domestic); 3 joint
	ventures(including 2 in life insurance business) and 1 associate -
	Chaitanya Godavari Gramin Bank. Union Bank of India is the first large
	public sector bank in the country to have implemented 100% core banking
	solution. The Bank has received several awards and recognition for its
	prowess in technology, digital banking, financial inclusion, MSME and
	development of human resources. Corporate and Registered Office : cro
	The registered as well as corporate headquarters of Union Bank of India
	is in the prestigious Nariman Point area of Mumbai, the commercial
	capital of India. Address in detail Union Bank Bhavan, 239, Vidhan
	Bhavan Marg, Nariman Point, Mumbai – 400 021, Maharashtra, India Phone
	number [Board] +91 22-22892000 Bank Website www.unionbankofindia.co.in

	Internet Banking site www.unionbankonline.co.in Call Centre 24x7</p>

	<p>All-India Toll Free numbers : 1800 22 22 44 / 1800 208 2244 /
	18004251515 Charged Numbers : 080-25300175 Dedicated number for NRI :
	+918061817110 Board of Directors : Union Bank of India’s Board members
	include eminent individuals with a wealth of experience in areas like,
	economy, rural and agriculture sector, banking and financial services,
	commerce & accountancy, strategy, Business development, analytics, risk
	management, central banking, merger & acquisition Link to Board of
	Directors Link : Details of all the Senior executives at Corporate
	Office Locate Us : Link to Branch Locator Capital Structure : The Bank
	has authorised share capital of Rs.10,000 crore. As on 30th September
	2021, the Bank has issued, subscribed and paid-up equity capital of Rs.
	6834.75 Crores, constituting 6,83,47,47,466 equity shares of Rs.10/-
	each. The Bank’s shares are listed on the National Stock Exchange of
	India Limited and the BSE Limited. Social Media Connects : History :

	Union Bank of India was established on 11th November 1919 with its
	headquarters in Mumbai. It was promoted by Seth Sitaram Poddar. The
	Head Office building of the Bank in Mumbai was inaugurated by Mahatma
	Gandhi, the Father of the nation in the year 1921, and he said on the
	occasion: "We should have the ability to carry on a big bank, to manage
	efficiently crores of rupees in the course of our national activities.
	Though we have not many banks amongst us, it does not follow that we
	are not capable of efficiently managing crores and tens of crores of
	rupees." His prescient words anticipated the growth of the bank that
	has taken place in the decades that followed. ubi-old Union Bank of
	India – Oldest Logo ubi-old1 Union-Bank-of-India Old Logo logo-new-ubi
	Union Bank of India Logo merge-ubi-andh Union Bank of India Logo – Post
	Amalgamation Logo: The logo features two interlocking U’s in red and
	blue, stands for the consumer and the bank. The two U’s stand for union
	and the integrity, security and strength, which Union Bank of India
	stands for. The colour blue represents commitment, while red is
	symbolic of the passion that exists at Union Bank of India Tagline :
	Good people to bank with अच्छे लोग अच्छा बैंक Did you know : The First
	safe deposit vault was formally opened on 22 April 1939. At the time of
	Independence in 1947 .Union Bank of India had 4 Branches. In 1964,
	Bank’s 100th Branch opened at Irinjalakuda in Kerala. 3 Pvt sector
	Banks Perunbavoor Bank Ltd, Catholic Union Bank Ltd, Nadar Mercantile
	Bank Ltd were taken over. In 1969 when Bank was nationalized Mr F.K.F
	Nariman became its first custodian. In 1974 Bank was assigned 8 Lead
	districts – 4 in UP, 2 each in Kerala and MP for assisting rural
	development. In 1975 Belgaum Bank Limited, a private sector Bank was
	taken over by Union Bank of India adding as many as 40 Branches. In
	1978 Bank became the first Nationalised Bank to publish Annual Report
	in Hindi. In 1982 Bank received Government’s National Award from
	President of India for outstanding export performance during 1979-80.
	In the post reforms era Bank doubled itself in business from 1993 to
	1996. In 1999 Sikkim Bank Ltd with 8 Branches merged with the Bank. In
	2002 Public Issue of 18 Crore shares oversubscribed by 5.22 times.
	Shares listed on BSE and NSE. In 2003 Bank was among the 1st Public
	Sector Banks to initiate Anytime and Anywhere Banking along with
	Telebanking. In 2004 the Bank was among the 7 new entrants to Forbes -
	2000 list of world’s biggest and most powerful companies. In 2007 Bank
	opened record number of 56 new branches across the country in a single
	Day. Bank opened its first Bio-metric ATM. Bank opened India’s highest
	altitude ATM at 14300 ft in Serethang, Nathulla, Sikkim. In 2008 Bank
	became the 1st Large nationalized Bank to achieve 100 % CBS networking.
	Bank unveils new logo and launches re-branding initiative. U-Mobile
	Launched –Becomes 1st Public sector Bank to launch Mobile Banking
	Facility in 2008. In 2009 Bank sponsored Rewa Siddhi Gramin Bank
	becomes the first RRB in the country to achieve 100 % CBS connectivity.
	In 2012 Bank inaugurates First Talking ATM specially made for the
	benefit of visually challenged. In 2013 Bank opened record 111 branches
	on its foundation day 11.11.2013. In 2014 Bank opened 96 branches on
	its foundation day i.e 11.11.2014. In 2015 Bank launched its UK
	subsidiary in London. Amalgamation : In August 2019 Union Bank of India
	has been selected by Government of India as Anchor Bank for the
	amalgamation of Andhra Bank, Corporation Bank into Union Bank of India.
	The amalgamation took place on 1st April 2020. Our proven history of
	reliability stems from excellence in customer service and trust built
	over combined legacy of 300+ years. The amalgamation will help us to
	offer best-in-class products through wider network of branches spanning
	each and every state of India. Technology at Core of Operations : On
	the technology front the Bank has taken various pioneering initiatives
	and has the distinction of 1st Public sector Bank to complete 100%
	computerization of its branches. We have a dedicated team of fully
	equipped professionals to manage more than 100 in-house applications.
	Many innovative products are developed using the technology platform to
	offer an array of choices to customers, adding speed and convenience to
	transactions. Technology has also enabled the Bank to derive
	substantial cost reduction while creating the requisite capacity to
	handle the ever increasing volume of business. DOWNLOAD APP app-ss</p>

	<p>app-ss-1 play-store android-app Energetic and Committed Workforce :

	Behind all these achievements is a dedicated team of staff, which is
	truly cosmopolitan in its composition. Many generations of members of
	staff have contributed in building up the strong edifice of the Bank.
	The present team of over 75000+ members of staff distinguishes itself
	with its customer centricity, willingness to learn and adherence to
	values enabling us to be recognized as a caring organization where
	people enjoy their work and relationship with customers. Investor
	Relations : All the latest, in-depth information about Union Bank of
	India’s financial performance, business initiatives. Link to Investor
	Relations RECRUITMENT : All the information related to Openings for
	recruitment in one of the Top 5 Public Sector Banks of India Link to
	Recruitment Corporate Social Responsibility : Union Bank of India is
	engaged in social and economic development at the national level. The
	Bank works closely with Union Bank Social Foundation Trust across
	diverse sectors and programs of social welfare. Union Bank of India’s
	CSR Policy Link : Union Bank Social Foundation Trust Activities ESG
	Practices : To know more about the latest ESG initiatives of Union Bank
	of India, please download the following document: ESG Initiatives
	Internet Banking Apply Online Saving Account Home Loan Vehicle Loan
	Education Loan Loan Against Property Agriculture Loan MSME LOAN Aadhaar
	Linking Online Loan Application Status Revival and Rehabilitation of
	MSME Pradhan Mantri Mudra Yojana e- NPS by Karvy E-NPS Interest Rates
	Interest Rates - Deposit Interest Rates - Loans & Advances Interest
	Rates for NRIs Interest Rate for Govt. Business Scheme Service Charges
	Wealth Management Insurance, Mutual Funds and Demat Online Trading
	Download our Apps Contact Us union union Red-Order-Hammer-Icon-Auctions
	AuctionsCalculatorsEMI
	CalculatorMan-Walking-Red-IconRecruitmentsTenders/Empanelment Tenders /
	EmpanelmentBank-HolidaysBank HolidaysDigital-CalendarDigital Calendar
	Click here to view auctions dated before 10-11-2021 | Privacy Policy |
	Cyber Security Tips| Disclaimer | RBI Monetary Museum | e-auction
	Common Landing Platform | Rajbhasha | RTI | Sitemap logo-wcag Copyright
	© 2021 Union Bank of India. All rights reservedFor more information
	about SUD Life Insurance products click here Back To TopScroll</p>
</body>
</html>