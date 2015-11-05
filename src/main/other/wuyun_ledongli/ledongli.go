package main

import (
	"flag"
	"fmt"
	"io/ioutil"
	"log"
	"net/http"
	"net/url"
	"time"
)

var (
	steps int = 100
)

func init() {
	flag.IntVar(&steps, "steps", 100, "steps to post")
	flag.Parse()
}
func main() {

	var now = time.Now()
	var date = now.Add(time.Duration(-now.Second()*int(time.Second) - now.Hour()*int(time.Hour) - now.Minute()*int(time.Minute)))
	values := url.Values{}
	values.Add("action", "profile")
	values.Add("pc", "XXXXXXXXXXX7")
	values.Add("cmd", "updatedaily")
	values.Add("uid", "XXXXXXXXX")
	values.Add("list", fmt.Sprintf(pp, date.Unix(), steps))

	resp, err := http.PostForm("http://pl.api.ledongli.cn/xq/io.ashx", values)

	defer func() {
		if resp != nil {
			bs, _ := ioutil.ReadAll(resp.Body)
			fmt.Printf("post date %d-%d-%d response->%s", now.Year(), now.Month(), now.Day(), string(bs))
			resp.Body.Close()
		}
	}()

	if err != nil {
		log.Fatal(err.Error())
	}

}

var pp = `[{"date":%d,"calories":2.7623466423200007,"activeValue":3409,"steps":%d,"pm2d5":0,"duration":60.03507041931152,"distance":57.334199999999996,"report":"[{\"activity\":\"walking\",\"duration\":60.03507041931152,\"distance\":0,\"steps\":0,\"calories\":0}]"}]`
