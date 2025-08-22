<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
	<xsl:template match="/">
		<!-- TODO: Auto-generated template -->
		<html>
			<body>
			<h1>customers list</h1>
			<table border="1">
				<tr>
					<th>Cust id</th>
					<th>Gender</th>
					<th>Name</th>
					<th>address</th>
				</tr>
				<tr>
					<td> <xsl:value-of select="/customers/customer/@id"></xsl:value-of> </td>
					<td> <xsl:value-of select="/customers/customer/@gender"></xsl:value-of> </td>
					<td> <xsl:value-of select="/customers/customer/name"></xsl:value-of> </td>
					<td> <xsl:value-of select="/customers/customer/address"></xsl:value-of> </td>
				</tr>
			</table>
			</body>
		</html>
	</xsl:template>
</xsl:stylesheet>