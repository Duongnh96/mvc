USE [member]
GO
/****** Object:  Table [dbo].[member]    Script Date: 12/1/2017 6:22:57 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[member](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[firstname] [nvarchar](255) NULL,
	[lastname] [nvarchar](255) NULL,
	[phone] [nvarchar](20) NULL,
	[descation] [nvarchar](255) NULL,
	[image] [nvarchar](255) NULL,
	[gender] [nvarchar](255) NULL,
	[vehicle] [nvarchar](255) NULL,
	[option] [nvarchar](255) NULL
) ON [PRIMARY]

GO
SET IDENTITY_INSERT [dbo].[member] ON 

INSERT [dbo].[member] ([ID], [firstname], [lastname], [phone], [descation], [image], [gender], [vehicle], [option]) VALUES (7, N'duoong', N'kfdkfdi', N'2223333333', N'fdfd', N'C:\Users\User\Pictures\3.jpg', N'male', N'Bike', N'Metter')
SET IDENTITY_INSERT [dbo].[member] OFF
