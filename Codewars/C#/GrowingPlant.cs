//    https://www.codewars.com/kata/simple-fun-number-74-growing-plant/train/csharp
//    Each day a plant is growing by upSpeed meters.
//    Each night that plant's height decreases by downSpeed meters due
//    to the lack of sun heat. Initially, plant is 0 meters tall.
//    We plant the seed at the beginning of a day. We want to know
//    when the height of the plant will reach a certain level.


namespace myjinxin
{
    using System;

    public class Kata
    {
        public int GrowingPlant(int UpSpeed, int DownSpeed, int DesiredHeight)
        {

            int days = DesiredHeight / UpSpeed;
            int height = days * (UpSpeed - DownSpeed);

            while (height < DesiredHeight)
            {
                height += UpSpeed;
                days++;
                if (height >= DesiredHeight)
                {
                    return days;
                }

                height -= DownSpeed;
            }

            return 0;
        }
    }
}