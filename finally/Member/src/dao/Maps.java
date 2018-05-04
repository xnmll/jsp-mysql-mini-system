package dao;

public class Maps {

	// 查询个人会员
	private static final String allPersonalMember = "SELECT count(*) FROM user where GroupNumber=\'1\'";
	// 查询企业会员
	private static final String allCompanyMember = "SELECT count(*) FROM user where GroupNumber=\'2\'";
	// 按条件查询个人会员
	private static final String queryPersonalMember = "select usernumber,username,email,question,answer,safecode from user where GroupNumber=\'1\' limit ?,?";
	// 按条件查询企业会员
	private static final String queryCompanyMember = "select usernumber,username,email,question,answer,safecode from user where GroupNumber=\'2\' limit ?,?";
	// 删除用户
	private static final String deletePersonalMemberSql = "delete from user where usernumber=?";
	// 删除个人会员详细信息
	private static final String deleteUserinfoSql = "delete from userinfo where username=?";
	// 删除企业会员详细信息
	private static final String deleteCompanyinfoSql = "delete from companyinfo where username=?";
	// 管理员添加会员
	private static final String AddPersonalMemberSql = "insert into user (usernumber,username,password,question,answer,safecode,email) values (?,?,?,?,?,?,?)";
	// 验证登录用户名
	private static final String checkUserSql = "select password,username from manager where username=?";
	// 会员成功登录时获得两个积分
	private static final String UpdateUserPoint = "UPDATE user SET point=point+2 WHERE username=?";

	// 注册成功时添加会员用户
	private static final String addMemberSql = "insert into user(usernumber,username,password,question,answer,safecode,img,email,GroupNumber,shenfen) values(?,?,?,?,?,?,?,?,?,?)";
	// 从会员表里选取最大会员编号，添加会员编号时使用
	private static final String selectMaxIdSql = "select max(usernumber) from user";
	// 查询所有会员记录数
	private static final String allMemberCount = "SELECT count(*) FROM user";
	// 按条件查询全部会员
	private static final String queryAllMember = "select usernumber,username,GroupNumber from user limit ?,?";
	// 根据会员编号更改该会员会员组编号及会员身份
	private static final String updateMemberNumberById = "update user set GroupNumber=?,shenfen=? where usernumber=?";
	// 根据会员编号更改该会员资料
	private static final String UpdateMemberSql = "update user set question=?,answer=?,safecode=? where usernumber=?";
	
	// 添加商品
	private static final String AddProductSql = "insert into product (ProductID,Version,PType,Content,bound,URL_1,addTime) values (?,?,?,?,?,?,?)";
	// 查询所有商品记录数
	private static final String allProduct = "SELECT count(*) FROM product";
	// 根据商品id查询商品名称
	private static final String queryProductById = "select ProductID from product where id=?";
	// 按条件查询商品
	private static final String queryProduct = "SELECT * FROM product limit ?,?";
	// 更新商品
	private static final String UpdateProductSql = "UPDATE product SET ProductID=?,Version=?,PType=?,Content=?  WHERE id=?";
	// 删除商品
	private static String deleteProductSql;

	// 按积分查询商品
	private static final String queryBound = "SELECT id,ProductId,Version,PType,Content,bound FROM product limit ?,?";
	// 更新积分
	private static final String UpdateBoundSql = "UPDATE product SET bound=? WHERE id=?";

	// 管理员添加点卡/用户充值点卡
	private static final String AddCardSql = "insert into card (CardNumber,CardPassword,Point,TimeOutDate,addTime) values (?,?,?,?,?)";
	// 查询所有点卡
	private static final String allCard = "SELECT count(*) FROM card";
	// 按条件查询点卡
	

	
	
	
	private static final String Addoneone = "insert into oneone (CardNumber,CardPassword,Point,TimeOutDate,addTime) values (?,?,?,?,?)";
//	private static final String Addonetwo = "insert into onetwo (CardNumber,CardPassword,Point,TimeOutDate,addTime) values (?,?,?,?,?)";
//	private static final String Addonethree= "insert into onethree (CardNumber,CardPassword,Point,TimeOutDate,addTime) values (?,?,?,?,?)";
//	private static final String Addtwoone = "insert into twoone (CardNumber,CardPassword,Point,TimeOutDate,addTime) values (?,?,?,?,?)";
//	private static final String Addtwotwo = "insert into twotwo (CardNumber,CardPassword,Point,TimeOutDate,addTime) values (?,?,?,?,?)";
//	private static final String Addtwothree = "insert into twothree (CardNumber,CardPassword,Point,TimeOutDate,addTime) values (?,?,?,?,?)";
//	private static final String Addtwofour = "insert into twofour	 (CardNumber,CardPassword,Point,TimeOutDate,addTime) values (?,?,?,?,?)";
//	private static final String Addthreetwo = "insert into threetwo (CardNumber,CardPassword,Point,TimeOutDate,addTime) values (?,?,?,?,?)";
//	private static final String Addthreethree = "insert into threethree (CardNumber,CardPassword,Point,TimeOutDate,addTime) values (?,?,?,?,?)";
//	private static final String Addthreefour = "insert into threefour (CardNumber,CardPassword,Point,TimeOutDate,addTime) values (?,?,?,?,?)";
//	private static final String Addfourone= "insert into fourone (CardNumber,CardPassword,Point,TimeOutDate,addTime) values (?,?,?,?,?)";
	
	
	// One
	private static final String allOneOne = "SELECT count(*) FROM oneone";
	private static final String queryOneOne = "SELECT * FROM oneone limit ?,?";
	private static final String allOneTwo = "SELECT count(*) FROM onetwo";
	private static final String queryOneTwo = "SELECT * FROM onetwo limit ?,?";
	private static final String allOneThree = "SELECT count(*) FROM onethree";
	private static final String queryOneThree = "SELECT * FROM onethree limit ?,?";
	// Two
	private static final String allTwoOne = "SELECT count(*) FROM twoone";
	private static final String queryTwoOne = "SELECT * FROM twoone limit ?,?";
	private static final String allTwoTwo = "SELECT count(*) FROM twotwo";
	private static final String queryTwoTwo = "SELECT * FROM twotwo limit ?,?";
	private static final String allTwoThree = "SELECT count(*) FROM twothree";
	private static final String queryTwoThree = "SELECT * FROM twothree limit ?,?";
	private static final String allTwoFour = "SELECT count(*) FROM twofour";
	private static final String queryTwoFour = "SELECT * FROM twofour limit ?,?";
	//Three
	private static final String allThreeTwo = "SELECT count(*) FROM threetwo";
	private static final String queryThreeTwo = "SELECT * FROM threetwo limit ?,?";
	private static final String allThreeThree = "SELECT count(*) FROM threethree";
	private static final String queryThreeThree = "SELECT * FROM threethree limit ?,?";
	private static final String allThreeFour = "SELECT count(*) FROM threefour";
	private static final String queryThreeFour = "SELECT * FROM threefour limit ?,?";
	//Four
	private static final String allFourOne = "SELECT count(*) FROM fourone";
	private static final String queryFourOne = "SELECT * FROM fourone limit ?,?";
	
	private static final String queryCard = "SELECT * FROM card limit ?,?";
	// 更新商品
	private static final String UpdateCardSql = "UPDATE card SET CardNumber=?,CardPassword=?,point=?,TimeOutDate=? WHERE CardID=?";

	// 企业会员登录后完善企业信息
	private static final String addCompanyMessageSql = "insert into companyuserinfo(username,C_Name,C_PostCode,C_Province,C_City,C_Address,C_ConactName,C_Vocation,C_WebSite,C_size,C_Tel,C_BankName,C_Capital) values(?,?,?,?,?,?,?,?,?,?,?,?,?)";
	// 个人会员登录后完善个人信息
	private static final String addPersonalMessageSql = "insert into userinfo(username,uname, sex,birthday, zjlb, zjhm, szsf, city, addr,yzbm,Tel,hompage,qq) values(?,?,?,?,?,?,?,?,?,?,?,?,?)";

	// 购买点卡后更新会员积分
	private static final String RechargeAndAddPointSql = "update user t1 join (select point from user where username = ?) as t2 on t1.point>=0 set t1.point=t1.point+? where t1.username = ?";

	// 用户兑换积分
	private static final String ExchangeSql = "update user u,card c join (select Point from card where CardNumber=?)as t2 set u.point=u.point+?,c.Point=t2.Point-? where u.username=? and c.CardNumber=?";

	// 管理员端展示交易明细
	private static final String showBuyProduct = "SELECT count(*) from buyproduct";

	// 按条件查询全部交易信息
	private static final String queryAllBuyProduct = "SELECT u.username,u.shenfen,p.ProductID,p.Version,p.PType,p.Content,p.bound FROM user u,product p,buyproduct b where b.id=p.id and u.username=b.username limit ?,?";

	// 管理员端展示交易明细
	private static final String showMemberBuyProduct = "SELECT count(*) from buyproduct where usernme=?";
	// 按条件查询个人交易信息
	private static final String queryOneMemberBuyProduct = "SELECT p.ProductID,p.Version,p.PType,p.Content,p.bound FROM user u,product p,buyproduct b where b.id=p.id and u.username=b.username and b.username=? limit ?,?";

	// 会员购买商品后扣除积分
	private static final String updateMemberPoint = "update user set point=point-? where username=?";

	// 根据商品编号获得商品id字段
	private static final String getProductid = "select id from product where ProductID=?";

	// 添加商品
	private static final String AddToBuyProduct = "insert into buyproduct (username,id) values (?,?)";

	// 用户购买后更新商品表中的已下载次数
	private static final String UpdateProductUseNumSql = "UPDATE product SET useNum=useNum+1 WHERE id=?";

	// 按积分查询所有会员
	private static final String allqueryPointSql = "SELECT username,point FROM user limit ?,?";
	// 更新会员积分
	private static final String updatePointSql = "UPDATE user SET point=? WHERE username=?";

	// 下载后更新会员积分
	private static final String usePointSql = "update user t1 join (select point from user where username = ?) as t2 on t1.point>=0 set t1.point=t1.point-? where t1.username = ?";
	// 查询所有公告
	private static final String allAnnouncement = "SELECT count(*) FROM announcement";
	// 按条件查询公告
	private static final String queryAnnouncement = "SELECT aid,title,people,pubdate FROM announcement limit ?,?";
	// 管理员添加公告
	private static final String addAnnouncementSql = "insert into announcement (title, people, pubdate, announcement) values (?,?,?,?)";
	// 删除公告
	private static String deleteAnnouncementSql;

	// 查询已购买的点卡数量
	private static final String mycard = "SELECT count(*) FROM card where username=?";

	// 按条件查询全部已购买点卡
	private static final String queryAllMyCard = "select CardNumber,CardPassword,Point,TimeOutDate,AddTime from card where username=? limit ?,?";

	// 用户兑换积分时检查输入的卡号和密码是否正确
	private static final String CheckCardNumberSql = "select * from card where CardNumber=? and CardPassword=?";

	// 查询某张点卡的点数
	private static final String selectPointFromCardSql = "select Point from card where CardNumber=?";

	//添加评论
	private static final String addCommentSql = "insert into comment(aid,username,content,commentTime) values(?,?,?,now())";
	
	public static String getAllcompanymember() {
		return allCompanyMember;
	}

	public static String getAllpersonalmember() {
		return allPersonalMember;
	}

	public static String getQuerypersonalmember() {
		return queryPersonalMember;
	}

	public static String getQuerycompanymember() {
		return queryCompanyMember;
	}

	public static String getDeletePersonalMemberSql() {
		return deletePersonalMemberSql;
	}

	public static String getAddPersonalMemberSql() {
		return AddPersonalMemberSql;
	}

	public static String getCheckUserSql() {
		return checkUserSql;
	}

	public static String getAddMemberSql() {
		return addMemberSql;
	}

	public static String getSelectMaxIdSql() {
		return selectMaxIdSql;
	}

	public static String getAddProductSql() {
		return AddProductSql;
	}

	public static String getProductCount() {
		return allProduct;
	}

	public static String getQueryProduct() {
		return queryProduct;
	}

	public static String getQueryProductByIdSql() {
		return queryProductById;
	}

	public static String getUpdateProductSql() {
		return UpdateProductSql;
	}

	public static String getDeleteProductSql(String ids) {
		deleteProductSql = "update product set UserDel=1 where id in(" + ids
				+ ")";
		return deleteProductSql;
	}

	public static String getAllMemberCount() {
		return allMemberCount;
	}

	public static String getQueryAllMember() {
		return queryAllMember;
	}

	public static String getUpdateMemberNumberById() {
		return updateMemberNumberById;
	}

	public static String getAddCardSql() {
		return AddCardSql;
	}
	public static String getAddonone() {
		return Addoneone;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	public static String getCardCount() {
		return allCard;
	}
	
	
	public static String getThreeTwoCount() {
		return allThreeTwo;
	}
	
	public static String getQueryThreeTwo() {
		return queryThreeTwo;
	}
	
	
	public static String getThreeThreeCount() {
		return allThreeThree;
	}
	
	public static String getQueryThreeThree() {
		return queryThreeThree;
	}
	
	public static String getThreeFourCount() {
		return allThreeFour;
	}
	
	public static String getQueryThreeFour() {
		return queryThreeFour;
	}
	
	public static String getFourOneCount() {
		return allFourOne;
	}
	
	public static String getQueryFourOne() {
		return queryFourOne;
	}
	
	//One One
	public static String getOneOneCount() {
		return allOneOne;
	}
	
	public static String getQueryOneOne() {
		return queryOneOne;
	}
	//One Two
	public static String getOneTwoCount() {
		return allOneTwo;
	}
	
	public static String getQueryOneTwo() {
		return queryOneTwo;
	}
	//One Three
	public static String getOneThreeCount() {
		return allOneThree;
	}
	
	public static String getQueryOneThree() {
		return queryOneThree;
	}
	//Two One
	public static String getTwoOneCount() {
		return allTwoOne;
	}
	
	public static String getQueryTwoOne() {
		return queryTwoOne;
	}
	//Two Two
	public static String getTwoTwoCount() {
		return allTwoTwo;
	}
	
	public static String getQueryTwoTwo() {
		return queryTwoTwo;
	}
	//Two Three
	public static String getTwoThreeCount() {
		return allTwoThree;
	}
	
	public static String getQueryTwoThree() {
		return queryTwoThree;
	}
	//Two Four
	public static String getTwoFourCount() {
		return allTwoFour;
	}
	
	public static String getQueryTwoFour() {
		return queryTwoFour;
	}
	
	
	
	
	
	

	public static String getQueryCard() {
		return queryCard;
	}

	public static String getUpdateCardSql() {
		return UpdateCardSql;
	}

	public static String getDeleteCardSql(String ids) {
		deleteProductSql = "delete from card where CardID in(" + ids + ")";
		return deleteProductSql;
	}

	public static String getAddCompanyMessageSql() {
		return addCompanyMessageSql;
	}

	public static String getAddPersonalMessageSql() {
		return addPersonalMessageSql;
	}

	public static String getQueryBound() {
		return queryBound;
	}

	public static String getUpdateBoundSql() {
		return UpdateBoundSql;
	}

	public static String getRechargeAndAddPointSql() {
		return RechargeAndAddPointSql;
	}

	public static String getExchangeSql() {
		return ExchangeSql;
	}

	public static String getShowBuyProduct() {
		return showBuyProduct;
	}

	public static String getQueryAllBuyProduct() {
		return queryAllBuyProduct;
	}

	public static String getShowMemberBuyProduct() {
		return showMemberBuyProduct;
	}

	public static String getQueryOneMemberBuyProduct() {
		return queryOneMemberBuyProduct;
	}

	public static String getUpdateMemberPoint() {
		return updateMemberPoint;
	}

	public static String getProductid() {
		return getProductid;
	}

	public static String getAddToBuyProduct() {
		return AddToBuyProduct;
	}

	public static String getUpdateProductUsenumSql() {
		return UpdateProductUseNumSql;
	}

	public static String getUpdateUserPoint() {
		return UpdateUserPoint;
	}

	public static String getUpdatePointSql() {
		return updatePointSql;
	}

	public static String getUsePointSql() {
		return usePointSql;
	}

	public static String getAnnouncementCount() {
		return allAnnouncement;
	}

	public static String getQueryAnnouncement() {
		return queryAnnouncement;
	}

	public static String getAddAnnouncementSql() {
		return addAnnouncementSql;
	}

	public static String getDeleteAnnouncementSql(String ids) {
		deleteAnnouncementSql = "delete from announcement where aid in(" + ids
				+ ")";
		return deleteAnnouncementSql;
	}

	public static String getAllQueryPoint() {
		return allqueryPointSql;
	}

	public static String getDeleteUserinfoSql() {
		return deleteUserinfoSql;
	}

	public static String getDeleteCompanyInfoSql() {
		return deleteCompanyinfoSql;
	}

	public static String getMyCard() {
		return mycard;
	}

	public static String getQueryAllMyCard() {
		return queryAllMyCard;
	}

	public static String getCheckCardNumberSql() {
		return CheckCardNumberSql;
	}

	public static String getSelectPointFromCardSql() {
		return selectPointFromCardSql;
	}

	public static String getUpdateMemberSql() {
		return UpdateMemberSql;
	}

	public static String getAddCommentSql() {
		return addCommentSql;
	}

}
