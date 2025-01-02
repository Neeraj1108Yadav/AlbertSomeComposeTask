package com.example.albertsomecomposetask.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.albertsomecomposetask.R
import com.example.albertsomecomposetask.model.DummyUser

@Composable
fun UserCard(user: DummyUser){
    ElevatedCard(
        onClick = {},
        shape = RoundedCornerShape(10.dp),
        colors = CardDefaults.cardColors(
            containerColor = Color.White
        ),
        elevation = CardDefaults.elevatedCardElevation(
            defaultElevation = 5.dp
        ),
        modifier = Modifier.padding(10.dp)
            .fillMaxWidth()

    ) {
        Row (
            modifier = Modifier.padding(10.dp),
            verticalAlignment = Alignment.CenterVertically
        ){
            Box{
                CircleImageView()
            }

            Box(
                modifier = Modifier.padding(start = 10.dp)
            ){
                Column {
                    UserName(user.name)
                    UserAddress(user.city,user.state,user.country,user.postCode)
                }
            }
        }
    }
}

@Composable
fun CircleImageView(){
    Image(
        painter = painterResource(id = R.drawable.ic_user),
        contentScale = ContentScale.Crop,
        modifier = Modifier
            .size(80.dp)
            .clip(CircleShape)
            .border(5.dp,Color.Gray,CircleShape)
            .padding(20.dp),
        contentDescription = "Circle Image"
    )
}

@Composable
fun UserName(name:String){
    Row{
        Image(
            painter = painterResource(id = R.drawable.ic_name),
            contentDescription = "Name",
            modifier = Modifier.padding(top = 5.dp)
        )
        Text(
            text = "$name",
            style = MaterialTheme.typography.titleMedium,
            modifier = Modifier.padding(start = 8.dp)
        )
    }
}

@Composable
fun UserAddress(
    city:String,
    state:String,
    country:String,
    postCode:String
){
    Row(modifier = Modifier.padding(top = 5.dp)){
        Image(
            painter = painterResource(id = R.drawable.ic_address),
            contentDescription = "Address",
            modifier = Modifier.padding(top = 3.dp)
        )
        Text(
            text = "$city, $state,\n$country-$postCode",
            style = MaterialTheme.typography.titleSmall,
            modifier = Modifier.padding(start = 8.dp)
        )
    }
}

@Preview(
    showBackground = true
)
@Composable
fun UserCardPreview(){
    UserCard(DummyUser("","","","","",""))
}