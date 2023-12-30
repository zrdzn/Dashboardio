import {ReactJSXElement} from "@emotion/react/types/jsx-namespace";
import React from "react";
import {Card, CardBody, CardHeader, Heading} from "@chakra-ui/react";

export interface WidgetProperties {
  title: string;
  content: ReactJSXElement;
}

export const Widget = (properties: WidgetProperties): ReactJSXElement => {
  return (
    <>
      <Card>
        <CardHeader>
          <Heading size='md'>
            {properties.title}
          </Heading>
        </CardHeader>
        <CardBody>
          {properties.content}
        </CardBody>
      </Card>
    </>
  );
};