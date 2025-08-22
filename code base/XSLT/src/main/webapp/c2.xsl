<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
	<xsl:template match="/">
		<!-- TODO: Auto-generated template -->
		<html>
			<body>
			<h1>customers list</h1>
			<table border="1">
				<tr>
					<th>serial num</th>
					<th>Cust id</th>
					<th>Gender</th>
					<th>Name</th>
					<th>address</th>
				</tr>
				<xsl:for-each select="/customers/customer">
				<tr>
					<td></td>
					<td> <xsl:value-of select="@id"></xsl:value-of> </td>
					<td> <xsl:value-of select="@gender"></xsl:value-of> </td>
					<td> <xsl:value-of select="name"></xsl:value-of> </td>
					<td> <xsl:value-of select="address"></xsl:value-of> </td>
				</tr>
				</xsl:for-each>
			</table>
			</body>
		</html>
	</xsl:template>
</xsl:stylesheet>