USE [TESTDB]
GO
/****** Object:  Table [dbo].[TaiKhoan]    Script Date: 14/06/2024 13:25:58 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[TaiKhoan](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[username] [nvarchar](50) NOT NULL,
	[password] [nvarchar](50) NOT NULL
) ON [PRIMARY]
GO
